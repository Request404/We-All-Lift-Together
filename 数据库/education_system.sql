/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80020
Source Host           : localhost:3306
Source Database       : education_system

Target Server Type    : MYSQL
Target Server Version : 80020
File Encoding         : 65001

Date: 2020-09-16 22:47:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin_account
-- ----------------------------
DROP TABLE IF EXISTS `admin_account`;
CREATE TABLE `admin_account` (
  `admin_id` int NOT NULL AUTO_INCREMENT,
  `admin_password` varchar(255) DEFAULT NULL,
  `admin_name` varchar(255) NOT NULL,
  `admin_add_time` datetime NOT NULL,
  `admin_email` varchar(255) NOT NULL,
  `admin_status` int NOT NULL DEFAULT '100',
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for course_table
-- ----------------------------
DROP TABLE IF EXISTS `course_table`;
CREATE TABLE `course_table` (
  `course_id` int NOT NULL AUTO_INCREMENT,
  `teacher_id` int NOT NULL,
  `teacher_name` varchar(255) DEFAULT NULL,
  `course_name` varchar(255) NOT NULL,
  `start_time` varchar(0) NOT NULL,
  `end_time` varchar(0) NOT NULL,
  `class_name` varchar(255) NOT NULL,
  `course_credit` decimal(10,1) NOT NULL,
  `course_date` varchar(255) NOT NULL,
  `course_sessions` int NOT NULL,
  PRIMARY KEY (`course_id`),
  KEY `class_name` (`class_name`),
  KEY `course_credit` (`course_credit`),
  KEY `teacher_id` (`teacher_id`),
  KEY `teacher_name` (`teacher_name`),
  KEY `course_name` (`course_name`),
  CONSTRAINT `course_table_ibfk_1` FOREIGN KEY (`teacher_id`) REFERENCES `teacher_info` (`teacher_id`),
  CONSTRAINT `course_table_ibfk_2` FOREIGN KEY (`teacher_name`) REFERENCES `teacher_info` (`teacher_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for elective_table
-- ----------------------------
DROP TABLE IF EXISTS `elective_table`;
CREATE TABLE `elective_table` (
  `elective_id` int NOT NULL AUTO_INCREMENT,
  `elective_name` varchar(255) NOT NULL,
  `teacher_id` int DEFAULT NULL,
  `teacher_name` varchar(255) DEFAULT NULL,
  `elective_start_time` varchar(255) NOT NULL,
  `elective_end_time` varchar(255) NOT NULL,
  `elective_date` varchar(255) NOT NULL,
  `elective_sessions` int NOT NULL,
  `elective_credit` decimal(10,0) NOT NULL,
  PRIMARY KEY (`elective_id`),
  KEY `elective_credit` (`elective_credit`),
  KEY `teacher_id` (`teacher_id`),
  KEY `teacher_name` (`teacher_name`),
  CONSTRAINT `elective_table_ibfk_1` FOREIGN KEY (`teacher_id`) REFERENCES `teacher_info` (`teacher_id`),
  CONSTRAINT `elective_table_ibfk_2` FOREIGN KEY (`teacher_name`) REFERENCES `teacher_info` (`teacher_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for student_account
-- ----------------------------
DROP TABLE IF EXISTS `student_account`;
CREATE TABLE `student_account` (
  `student_id` int NOT NULL,
  `student_password` varchar(255) NOT NULL,
  `student_email` varchar(255) NOT NULL,
  `student_status` int NOT NULL DEFAULT '100',
  PRIMARY KEY (`student_id`),
  KEY `student_email` (`student_email`),
  CONSTRAINT `student_account_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `student_info` (`student_id`),
  CONSTRAINT `student_account_ibfk_2` FOREIGN KEY (`student_email`) REFERENCES `student_info` (`student_email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for student_affairs
-- ----------------------------
DROP TABLE IF EXISTS `student_affairs`;
CREATE TABLE `student_affairs` (
  `affairs_id` int NOT NULL AUTO_INCREMENT,
  `student_id` int NOT NULL,
  `application_name` varchar(255) NOT NULL,
  `application_time` datetime NOT NULL COMMENT '申请时间',
  `affairs_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '申请标题',
  `affairs_content` text CHARACTER SET utf8 COLLATE utf8_general_ci,
  `application_status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '待处理',
  `handle_teacher_id` int DEFAULT NULL,
  `handle_teacher` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '处理人',
  PRIMARY KEY (`affairs_id`),
  KEY `student_id` (`student_id`),
  KEY `application_name` (`application_name`),
  KEY `handle_teacher_id` (`handle_teacher_id`),
  KEY `handle_teacher` (`handle_teacher`),
  CONSTRAINT `student_affairs_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `student_info` (`student_id`),
  CONSTRAINT `student_affairs_ibfk_2` FOREIGN KEY (`application_name`) REFERENCES `student_info` (`student_name`),
  CONSTRAINT `student_affairs_ibfk_3` FOREIGN KEY (`handle_teacher_id`) REFERENCES `teacher_info` (`teacher_id`),
  CONSTRAINT `student_affairs_ibfk_4` FOREIGN KEY (`handle_teacher`) REFERENCES `teacher_info` (`teacher_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for student_elective
-- ----------------------------
DROP TABLE IF EXISTS `student_elective`;
CREATE TABLE `student_elective` (
  `student_id` int NOT NULL,
  `student_name` varchar(255) NOT NULL,
  `student_class` varchar(255) NOT NULL,
  `elective_id` int NOT NULL,
  `elective_score` decimal(10,1) NOT NULL,
  `elective_grade` varchar(255) NOT NULL,
  `elective_credit` decimal(10,1) NOT NULL,
  KEY `student_id` (`student_id`),
  KEY `student_name` (`student_name`),
  KEY `student_class` (`student_class`),
  KEY `elective_id` (`elective_id`),
  KEY `elective_credit` (`elective_credit`),
  CONSTRAINT `student_elective_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `student_info` (`student_id`),
  CONSTRAINT `student_elective_ibfk_2` FOREIGN KEY (`student_name`) REFERENCES `student_info` (`student_name`),
  CONSTRAINT `student_elective_ibfk_3` FOREIGN KEY (`student_class`) REFERENCES `student_info` (`student_class`),
  CONSTRAINT `student_elective_ibfk_4` FOREIGN KEY (`elective_id`) REFERENCES `elective_table` (`elective_id`),
  CONSTRAINT `student_elective_ibfk_5` FOREIGN KEY (`elective_credit`) REFERENCES `elective_table` (`elective_credit`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for student_info
-- ----------------------------
DROP TABLE IF EXISTS `student_info`;
CREATE TABLE `student_info` (
  `student_id` int NOT NULL AUTO_INCREMENT,
  `student_name` varchar(255) NOT NULL,
  `student_gender` varchar(255) NOT NULL,
  `student_brithday` date NOT NULL,
  `student_recial` varchar(255) NOT NULL,
  `student_native_place` varchar(255) NOT NULL,
  `student_join_time` date NOT NULL,
  `student_major` varchar(255) NOT NULL,
  `student_class` varchar(255) NOT NULL,
  `student_phone` int DEFAULT NULL,
  `student_cellphone` varchar(255) DEFAULT NULL,
  `student_address` varchar(255) NOT NULL,
  `student_emergency_contact` varchar(255) NOT NULL,
  `student_contact_phone` varchar(255) NOT NULL,
  `student_email` varchar(255) NOT NULL,
  `student_remark` varchar(255) DEFAULT NULL,
  `studeent_photo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`student_id`),
  KEY `student_email` (`student_email`),
  KEY `student_class` (`student_class`),
  KEY `student_name` (`student_name`)
) ENGINE=InnoDB AUTO_INCREMENT=10011 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for student_transcript
-- ----------------------------
DROP TABLE IF EXISTS `student_transcript`;
CREATE TABLE `student_transcript` (
  `student_id` int NOT NULL,
  `student_name` varchar(255) NOT NULL,
  `student_class` varchar(255) NOT NULL,
  `teacher_id` int NOT NULL,
  `teacher_name` varchar(255) NOT NULL,
  `course_id` int NOT NULL,
  `course_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `course_grade` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `course_score` decimal(10,1) DEFAULT '0.0',
  `course_credit` decimal(10,1) NOT NULL,
  KEY `student_id` (`student_id`),
  KEY `student_name` (`student_name`),
  KEY `student_class` (`student_class`),
  KEY `teacher_id` (`teacher_id`),
  KEY `teacher_name` (`teacher_name`),
  KEY `course_id` (`course_id`),
  KEY `course_name` (`course_name`),
  KEY `course_credit` (`course_credit`),
  CONSTRAINT `student_transcript_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `student_info` (`student_id`),
  CONSTRAINT `student_transcript_ibfk_2` FOREIGN KEY (`student_name`) REFERENCES `student_info` (`student_name`),
  CONSTRAINT `student_transcript_ibfk_3` FOREIGN KEY (`student_class`) REFERENCES `student_info` (`student_class`),
  CONSTRAINT `student_transcript_ibfk_4` FOREIGN KEY (`teacher_id`) REFERENCES `teacher_info` (`teacher_id`),
  CONSTRAINT `student_transcript_ibfk_5` FOREIGN KEY (`teacher_name`) REFERENCES `teacher_info` (`teacher_name`),
  CONSTRAINT `student_transcript_ibfk_6` FOREIGN KEY (`course_id`) REFERENCES `course_table` (`course_id`),
  CONSTRAINT `student_transcript_ibfk_7` FOREIGN KEY (`course_name`) REFERENCES `course_table` (`course_name`),
  CONSTRAINT `student_transcript_ibfk_8` FOREIGN KEY (`course_credit`) REFERENCES `course_table` (`course_credit`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for teacher_account
-- ----------------------------
DROP TABLE IF EXISTS `teacher_account`;
CREATE TABLE `teacher_account` (
  `teacher_id` int NOT NULL,
  `teacher_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '123456',
  `teacher_email` varchar(255) NOT NULL,
  `teacher_status` int NOT NULL DEFAULT '100',
  PRIMARY KEY (`teacher_id`),
  KEY `teacher_email` (`teacher_email`),
  CONSTRAINT `teacher_account_ibfk_1` FOREIGN KEY (`teacher_id`) REFERENCES `teacher_info` (`teacher_id`),
  CONSTRAINT `teacher_account_ibfk_2` FOREIGN KEY (`teacher_email`) REFERENCES `teacher_info` (`teacher_eamil`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for teacher_info
-- ----------------------------
DROP TABLE IF EXISTS `teacher_info`;
CREATE TABLE `teacher_info` (
  `teacher_id` int NOT NULL AUTO_INCREMENT,
  `teacher_name` varchar(255) NOT NULL,
  `teacher_gender` varchar(255) NOT NULL,
  `teacher_birthday` date NOT NULL,
  `teacher_recial` varchar(255) NOT NULL,
  `teacher_native_place` varchar(255) NOT NULL,
  `teacher_marital_status` varchar(255) NOT NULL COMMENT '婚姻状况',
  `teacher_join_time` date NOT NULL,
  `teacher_education` varchar(255) NOT NULL COMMENT '学历',
  `teacher_graduated_place` varchar(255) DEFAULT NULL,
  `teacher_phone` varchar(255) DEFAULT NULL,
  `teacher_cellphone` varchar(255) DEFAULT NULL,
  `teacher_eamil` varchar(255) NOT NULL,
  `teacher_position` varchar(255) DEFAULT NULL COMMENT '职位',
  `teacher_remark` varchar(255) NOT NULL,
  `teacher_photo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`teacher_id`),
  KEY `teacher_eamil` (`teacher_eamil`),
  KEY `teacher_name` (`teacher_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
