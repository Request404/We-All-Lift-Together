/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80020
Source Host           : localhost:3306
Source Database       : education_system

Target Server Type    : MYSQL
Target Server Version : 80020
File Encoding         : 65001

Date: 2020-09-22 15:48:36
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin_account
-- ----------------------------
INSERT INTO `admin_account` VALUES ('1', '123456', 'haha', '2020-09-16 16:22:38', '123@qq.com', '100');
INSERT INTO `admin_account` VALUES ('2', '123456', 'hehe', '2020-09-16 16:22:38', '123@qq.com', '100');

-- ----------------------------
-- Table structure for course_table
-- ----------------------------
DROP TABLE IF EXISTS `course_table`;
CREATE TABLE `course_table` (
  `course_id` int NOT NULL AUTO_INCREMENT,
  `teacher_id` int NOT NULL,
  `teacher_name` varchar(255) DEFAULT NULL,
  `course_name` varchar(255) NOT NULL,
  `start_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `end_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
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
) ENGINE=InnoDB AUTO_INCREMENT=1039 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course_table
-- ----------------------------
INSERT INTO `course_table` VALUES ('1001', '100102', '张国华', 'PS数字图像处理', '5', '11', '18计算机应用技术1班', '6.0', '1', '1');
INSERT INTO `course_table` VALUES ('1002', '100102', '张国华', 'PS数字图像处理', '5', '11', '18计算机应用技术1班', '6.0', '1', '2');
INSERT INTO `course_table` VALUES ('1003', '100102', '张国华', 'PS数字图像处理', '5', '11', '18计算机应用技术1班', '6.0', '1', '3');
INSERT INTO `course_table` VALUES ('1004', '100102', '张国华', 'PS数字图像处理', '5', '11', '18计算机应用技术1班', '6.0', '1', '4');
INSERT INTO `course_table` VALUES ('1005', '100102', '张国华', 'PS数字图像处理', '5', '11', '18计算机应用技术2班', '6.0', '1', '5');
INSERT INTO `course_table` VALUES ('1006', '100102', '张国华', 'PS数字图像处理', '5', '11', '18计算机应用技术2班', '6.0', '1', '6');
INSERT INTO `course_table` VALUES ('1007', '100102', '张国华', 'PS数字图像处理', '5', '11', '18计算机应用技术2班', '6.0', '1', '7');
INSERT INTO `course_table` VALUES ('1008', '100102', '张国华', 'PS数字图像处理', '5', '11', '18计算机应用技术2班', '6.0', '1', '8');
INSERT INTO `course_table` VALUES ('1011', '100102', '张国华', 'PS数字图像处理', '5', '11', '18计算机应用技术3班', '6.0', '2', '1');
INSERT INTO `course_table` VALUES ('1012', '100102', '张国华', 'PS数字图像处理', '5', '11', '18计算机应用技术3班', '6.0', '2', '2');
INSERT INTO `course_table` VALUES ('1013', '100102', '张国华', 'PS数字图像处理', '5', '11', '18计算机应用技术3班', '6.0', '2', '3');
INSERT INTO `course_table` VALUES ('1014', '100102', '张国华', 'PS数字图像处理', '5', '11', '18计算机应用技术3班', '6.0', '2', '4');
INSERT INTO `course_table` VALUES ('1015', '100102', '张国华', 'PS数字图像处理', '5', '11', '18数字媒体1班', '6.0', '2', '5');
INSERT INTO `course_table` VALUES ('1016', '100102', '张国华', 'PS数字图像处理', '5', '11', '18数字媒体1班', '6.0', '2', '6');
INSERT INTO `course_table` VALUES ('1017', '100102', '张国华', 'PS数字图像处理', '5', '11', '18数字媒体1班', '6.0', '2', '7');
INSERT INTO `course_table` VALUES ('1018', '100102', '张国华', 'PS数字图像处理', '5', '11', '18数字媒体1班', '6.0', '2', '8');
INSERT INTO `course_table` VALUES ('1021', '100102', '张国华', 'PS数字图像处理', '5', '11', '18数字媒体2班', '6.0', '3', '1');
INSERT INTO `course_table` VALUES ('1022', '100102', '张国华', 'PS数字图像处理', '5', '11', '18数字媒体2班', '6.0', '3', '2');
INSERT INTO `course_table` VALUES ('1023', '100102', '张国华', 'PS数字图像处理', '5', '11', '18数字媒体2班', '6.0', '3', '3');
INSERT INTO `course_table` VALUES ('1024', '100102', '张国华', 'PS数字图像处理', '5', '11', '18数字媒体2班', '6.0', '3', '4');
INSERT INTO `course_table` VALUES ('1025', '100103', '邓池潮', 'web网页设计', '1', '11', '18计算机应用1班', '6.0', '3', '5');
INSERT INTO `course_table` VALUES ('1026', '100103', '邓池潮', 'web网页设计', '1', '11', '18计算机应用1班', '6.0', '3', '6');
INSERT INTO `course_table` VALUES ('1027', '100103', '邓池潮', 'web网页设计', '1', '11', '18计算机应用2班', '6.0', '3', '7');
INSERT INTO `course_table` VALUES ('1028', '100103', '邓池潮', 'web网页设计', '1', '11', '18计算机应用2班', '6.0', '3', '8');
INSERT INTO `course_table` VALUES ('1031', '100103', '邓池潮', 'web网页设计', '1', '11', '18计算机应用3班', '6.0', '4', '1');
INSERT INTO `course_table` VALUES ('1032', '100103', '邓池潮', 'web网页设计', '1', '11', '18计算机应用3班', '6.0', '4', '2');
INSERT INTO `course_table` VALUES ('1033', '100103', '邓池潮', 'web网页设计', '1', '11', '18计算机网络技术1班', '6.0', '4', '3');
INSERT INTO `course_table` VALUES ('1034', '100103', '邓池潮', 'web网页设计', '1', '11', '18计算机网络技术1班', '6.0', '4', '4');
INSERT INTO `course_table` VALUES ('1035', '100103', '邓池潮', 'web网页设计', '1', '11', '18计算机网络技术2班', '6.0', '4', '5');
INSERT INTO `course_table` VALUES ('1036', '100103', '邓池潮', 'web网页设计', '1', '11', '18计算机网络技术2班', '6.0', '4', '6');
INSERT INTO `course_table` VALUES ('1037', '100103', '邓池潮', 'web网页设计', '1', '11', '18计算机网络技术3班', '6.0', '4', '7');
INSERT INTO `course_table` VALUES ('1038', '100103', '邓池潮', 'web网页设计', '1', '11', '18计算机网络技术3班', '6.0', '4', '8');

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
) ENGINE=InnoDB AUTO_INCREMENT=1355425 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of elective_table
-- ----------------------------
INSERT INTO `elective_table` VALUES ('1355401', '母猪的产后护理', '100109', '赵东城', '1', '6', '2', '5', '5');
INSERT INTO `elective_table` VALUES ('1355402', '视觉设计竞赛', '100110', '李青', '1', '12', '6', '1', '3');
INSERT INTO `elective_table` VALUES ('1355403', '影视鉴赏', '100108', '黄佳玲', '2', '10', '1', '4', '1');
INSERT INTO `elective_table` VALUES ('1355404', '幸福心理学', '100107', '刘佳红', '2', '11', '5', '2', '1');
INSERT INTO `elective_table` VALUES ('1355405', '宝石鉴赏', '100106', '王振', '4', '11', '3', '3', '2');
INSERT INTO `elective_table` VALUES ('1355406', '华为路由交换技术', '100105', '卢生', '3', '17', '2', '3', '4');
INSERT INTO `elective_table` VALUES ('1355407', '生命的起源', '100104', '焦俊', '10', '19', '2', '5', '1');
INSERT INTO `elective_table` VALUES ('1355408', '红色革命起源', '100102', '张国华', '11', '20', '4', '3', '2');
INSERT INTO `elective_table` VALUES ('1355409', '戏曲', '100103', '邓池潮', '1', '16', '7', '5', '5');
INSERT INTO `elective_table` VALUES ('1355410', '积极心理学', '100108', '黄佳玲', '5', '17', '4', '3', '4');
INSERT INTO `elective_table` VALUES ('1355411', 'vR智能', '100107', '刘佳红', '3', '19', '2', '4', '4');
INSERT INTO `elective_table` VALUES ('1355412', '社交艺术', '100105', '卢生', '2', '15', '4', '3', '1');
INSERT INTO `elective_table` VALUES ('1355413', '昆曲', '100103', '邓池潮', '4', '11', '1', '4', '1');
INSERT INTO `elective_table` VALUES ('1355414', '音乐鉴赏', '100110', '李青', '1', '11', '2', '2', '3');
INSERT INTO `elective_table` VALUES ('1355415', '健康运动', '100109', '赵东城', '1', '7', '1', '4', '1');
INSERT INTO `elective_table` VALUES ('1355416', '形态礼仪', '100102', '张国华', '1', '12', '3', '1', '3');
INSERT INTO `elective_table` VALUES ('1355417', '微积分', '100106', '王振', '3', '13', '2', '4', '2');
INSERT INTO `elective_table` VALUES ('1355418', '自然地理', '100101', 'ylg', '4', '14', '4', '5', '1');
INSERT INTO `elective_table` VALUES ('1355419', '生态学', '100108', '黄佳玲', '11', '17', '4', '3', '0');
INSERT INTO `elective_table` VALUES ('1355420', '遗传学', '100105', '卢生', '2', '14', '2', '2', '1');
INSERT INTO `elective_table` VALUES ('1355421', '微机原理', '100110', '李青', '1', '10', '4', '2', '4');
INSERT INTO `elective_table` VALUES ('1355422', '图像处理', '100107', '刘佳红', '3', '19', '1', '3', '2');
INSERT INTO `elective_table` VALUES ('1355423', '理财学', '100104', '焦俊', '2', '17', '4', '4', '2');
INSERT INTO `elective_table` VALUES ('1355424', '图文解析', '100103', '邓池潮', '1', '16', '5', '3', '7');

-- ----------------------------
-- Table structure for student_account
-- ----------------------------
DROP TABLE IF EXISTS `student_account`;
CREATE TABLE `student_account` (
  `student_id` int NOT NULL,
  `student_password` varchar(255) NOT NULL,
  `student_email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '123@qq.com',
  `student_status` int NOT NULL DEFAULT '100',
  PRIMARY KEY (`student_id`),
  KEY `student_email` (`student_email`),
  CONSTRAINT `student_account_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `student_info` (`student_id`),
  CONSTRAINT `student_account_ibfk_2` FOREIGN KEY (`student_email`) REFERENCES `student_info` (`student_email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_account
-- ----------------------------
INSERT INTO `student_account` VALUES ('10012', '123456', 'key2003@gmail.com', '100');

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
  `application_status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '未处理',
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
) ENGINE=InnoDB AUTO_INCREMENT=100004 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_affairs
-- ----------------------------
INSERT INTO `student_affairs` VALUES ('100001', '10026', '沈明', '2020-09-19 09:14:43', '感冒', '无', '未批准', '100108', '黄佳玲');
INSERT INTO `student_affairs` VALUES ('100002', '10022', '陈文', '2020-09-19 09:22:56', '头疼', '无', '批准', '100102', '张国华');
INSERT INTO `student_affairs` VALUES ('100003', '10031', '黄炆', '2020-05-19 09:22:56', '家里有事', '无', '处理', '100104', '焦俊');

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
-- Records of student_elective
-- ----------------------------

-- ----------------------------
-- Table structure for student_info
-- ----------------------------
DROP TABLE IF EXISTS `student_info`;
CREATE TABLE `student_info` (
  `student_id` int NOT NULL AUTO_INCREMENT,
  `student_name` varchar(255) NOT NULL,
  `student_gender` varchar(255) NOT NULL,
  `student_birthday` date NOT NULL,
  `student_racial` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
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
  `student_photo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`student_id`),
  KEY `student_email` (`student_email`),
  KEY `student_class` (`student_class`),
  KEY `student_name` (`student_name`)
) ENGINE=InnoDB AUTO_INCREMENT=10047 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_info
-- ----------------------------
INSERT INTO `student_info` VALUES ('10012', '张鹏', '男', '1999-12-03', '汉', '广东省广州市', '2018-09-06', '计算机网络技术', '18计算机网络技术2班', '5523660', '15403655598', '广东省广州市林和街道天润路32号', '张雯', '15807581155', 'key2003@gmail.com', '无', null);
INSERT INTO `student_info` VALUES ('10013', '梁叙雯', '女', '1998-06-05', '汉', '广东省肇庆市', '2018-09-06', '计算机网络技术', '18计算机网络技术2班', '2165564', '18711253366', '广东省广州市天河区新塘街道沐陂西路18号珠江嘉苑', '梁至信', '18503301661', '988746532@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10014', '王五', '男', '2000-05-24', '汉', '广东省广州市', '2018-07-08', '信息管理技术', '18计算机信息管理3班', '15448553', '15445558965', '广东省广州市天河区天寿路1号', '王宝', '15445558965', '3254458845@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10015', '吴京', '男', '2000-07-24', '汉', '广东省广州市', '2018-07-08', '软件技术', '18计算机软件技术3班', '15442583', '15443544965', '广东省广州市天河区天寿路3号', '吴刚', '15445558965', '3254658845@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10016', '王安柏', '女', '2000-01-02', '汉', '广东省广州市', '2018-09-06', '计算机网络技术', '18计算机网络技术2班', '21022456', '15206994414', '广东省广州市番禺区东环街道莲花大道中203号', '王显龙', '18515566201', '789855412@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10017', '李湘', '女', '2000-03-24', '汉', '广东省广州市', '2018-07-08', '计算机应用技术', '18计算机应用技术3班', '15524583', '17843544965', '广东省广州市天河区天寿路5号', '李妾', '17855558965', '3258658845@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10018', '钱湘', '男', '2000-01-24', '汉', '广东省广州市', '2018-07-08', '计算机应用技术', '18计算机应用技术1班', '15584583', '17843544595', '广东省广州市天河区天寿路7号', '钱生', '17855258965', '3258658255@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10019', '陈丽花', '女', '1999-07-05', '汉', '广东省东莞市', '2018-09-06', '计算机网络技术', '18计算机网络技术2班', '6559887', '13504479985', '广东省东莞市大岭山镇拥军路12号', '李治华', '13538998422', 'cat1955@163.com', '无', null);
INSERT INTO `student_info` VALUES ('10020', '牛亦', '男', '2000-09-24', '汉', '广东省广州市', '2018-07-08', '计算机应用技术', '18计算机应用技术2班', '15584584', '17843544545', '广东省广州市天河区天寿路9号', '牛王', '17855258495', '3258658258@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10021', '李软安', '男', '1999-07-15', '汉', '广东省东莞市', '2018-09-06', '计算机网络技术', '18计算机网络技术2班', '6554588', '13502203455', '广东省东莞市莞长路54号', '李国立', '13536445881', '9527001d@163.com', '无', null);
INSERT INTO `student_info` VALUES ('10022', '陈文', '男', '2000-11-24', '汉', '广东省广州市', '2018-07-08', '计算机应用技术', '18计算机应用技术1班', '15584587', '17843544546', '广东省广州市天河区天寿路11号', '陈继', '17855258495', '3258658259@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10023', '苗贺', '男', '2000-10-24', '汉', '广东省广州市', '2018-07-08', '计算机应用技术', '18计算机应用技术3班', '15584585', '17843544547', '广东省广州市天河区天寿路13号', '苗将', '17855258496', '3258658250@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10024', '黄君明', '男', '1999-04-15', '汉', '广东省东莞市', '2018-09-06', '计算机网络技术', '18计算机网络技术2班', '65542354', '14550789946', '广东省东莞市大岭山镇元岭村', '陈丽', '14615879633', '865452102@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10025', '毛韦', '男', '2000-12-24', '汉', '广东省广州市', '2018-07-08', '信息管理技术', '18计算机信息管理2班', '15584885', '17843544587', '广东省广州市天河区天寿路15号', '毛文', '17855258396', '3258858250@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10026', '沈明', '女', '2000-12-28', '汉', '广东省广州市', '2018-07-08', '信息管理技术', '18计算机信息管理1班', '15984885', '17843544583', '广东省广州市天河区天寿路17号', '沈家', '17855258393', '3258858230@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10027', '郑载华', '男', '1999-06-19', '汉', '广东省东莞市', '2018-09-06', '计算机网络技术', '18计算机网络技术2班', '65552668', '16522897785', '广东省肇庆市高要区环镇路128号', '郑雪梅', '16523396886', '584633352@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10028', '胡京华', '男', '1999-09-18', '汉', '广东省肇庆市', '2018-09-06', '计算机网络技术', '18计算机网络技术2班', '5526889', '16895581165', '广东省肇庆市端州区玑西路北3号', '胡进', '16845776998', '584633352@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10029', '刘旻', '男', '2000-11-28', '汉', '广东省广州市', '2018-07-08', '计算机网络技术', '18计算机网络技术3班', '15984365', '17543544533', '广东省广州市天河区天寿路19号', '刘宇', '17857258363', '32562858830@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10030', '邓晨', '男', '2001-01-06', '汉', '广东省肇庆市', '2018-09-06', '计算机网络技术', '18计算机网络技术2班', '5525422', '15612349945', '广东省肇庆市端州区站北路12号', '邓启华', '15236694452', 'dk12225@163.com', '无', null);
INSERT INTO `student_info` VALUES ('10031', '黄炆', '男', '2000-10-28', '汉', '广东省广州市', '2018-07-08', '计算机网络技术', '18计算机网络技术1班', '14224365', '175435434533', '广东省广州市天河区天寿路21号', '黄正', '17856258363', '32562858730@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10032', '吴熠璠', '男', '2000-11-25', '汉', '广东省汕头市', '2018-09-06', '计算机网络技术', '18计算机网络技术2班', '35220142', '15669325251', '广东省汕头市金平区汕樟路31号', '吴可富', '15678441155', 'wyjjilu@163.com', '无', null);
INSERT INTO `student_info` VALUES ('10033', '袁雪', '女', '1999-10-28', '汉', '广东省广州市', '2018-07-08', '人工智能', '18人工智能1班', '13424365', '185435434533', '广东省广州市黄埔区黄埔路28号', '袁蒋', '17856268363', '32462958730@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10034', '袁文涛', '男', '1999-11-25', '汉', '广东省汕头市', '2018-09-06', '计算机网络技术', '18计算机网络技术2班', '35564498', '14598857789', '广东省汕头市龙湖区碧霞街23号', '袁青', '13539693888', 'gren8975@gmail.com', '无', null);
INSERT INTO `student_info` VALUES ('10035', '赵丽', '女', '1999-09-28', '汉', '广东省佛山市', '2018-07-08', '数字媒体', '18数字媒体1班', '18424765', '185939434533', '广东省佛山市大沥镇广云路28号', '赵晗', '17856261263', '82462958730@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10036', '蔡剑华', '男', '1997-04-01', '汉', '广东省汕头市', '2018-09-06', '计算机网络技术', '18计算机网络技术2班', '35566653', '14699853179', '广东省汕头市龙湖区珠池街道黄山路珠业南街13号', '谢琴丽', '13537888528', '852463125@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10037', '曾琦', '男', '1999-02-19', '汉', '广东省江门市', '2018-07-08', '数字媒体', '18数字媒体2班', '19424465', '185939434503', '广东省江门市蓬江区新门村136号', '曾远龙', '17856281263', '82461958730@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10038', '钟宝佳', '女', '1999-01-15', '汉', '广东省深圳市', '2018-07-08', '数字媒体', '18数字媒体1班', '16329465', '181939434503', '广东省深圳市龙华区求知二路34号', '钟纪', '17856281785', '62461958730@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10039', '林城', '男', '2001-01-15', '汉', '广东省深圳市', '2018-07-08', '大数据分析', '18大数据分析2班', '14321465', '186939434503', '广东省深圳市龙华区观湖街道润城社区广场沿河路6号', '林宝业', '16256281785', '57461958730@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10040', '谢勇', '男', '2000-04-30', '汉', '广东省惠州市', '2018-07-08', '大数据分析', '18大数据分析1班', '14328965', '186636434503', '广东省惠州市惠城区环岛二路3号', '谢里华', '16756281785', '47461958730@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10041', '周建华', '男', '1999-04-30', '汉', '广东省汕头市', '2018-09-06', '计算机网络技术', '18计算机网络技术1班', '35562114', '14489663214', '广东省汕头市潮南区义晖路91号义英新寨小区', '周海君', '14523698852', '1022347851@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10042', '何林', '男', '2000-07-30', '汉', '广东省河源市', '2018-07-08', '数字媒体', '18数字媒体1班', '19328963', '186436434503', '广东省河源市源城区高塘丰源新村', '何樟', '16756281365', '37461988730@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10043', '魏绪鹏', '男', '1999-05-14', '汉', '广东省汕头市', '2018-09-06', '计算机网络技术', '18计算机网络技术1班', '35568774', '14485789443', '广东省汕头市潮南区东风路东8巷18号', '魏文武', '14528874603', '297783941@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10044', '杨广', '男', '2000-07-03', '汉', '广东省汕尾市', '2018-07-08', '数字媒体', '18数字媒体2班', '19128973', '186436434513', '广东省汕尾市海丰县', '杨洋', '16756271325', '35461088730@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10045', '明月', '女', '2000-07-23', '汉', '广东省汕尾市', '2018-07-08', '自动化技术', '18自动化2班', '25128973', '186736434513', '广东省汕尾市陆河县', '明兰', '16753271425', '75471088730@qq.com', '无', null);
INSERT INTO `student_info` VALUES ('10046', '蔡明', '男', '2000-04-24', '汉', '广东省梅州市', '2018-07-08', '自动化技术', '18自动化1班', '35128923', '186736634513', '广东省梅州市大埔县', '蔡金', '16753271429', '85471088730@qq.com', '无', null);

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
-- Records of student_transcript
-- ----------------------------

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
-- Records of teacher_account
-- ----------------------------

-- ----------------------------
-- Table structure for teacher_info
-- ----------------------------
DROP TABLE IF EXISTS `teacher_info`;
CREATE TABLE `teacher_info` (
  `teacher_id` int NOT NULL AUTO_INCREMENT,
  `teacher_name` varchar(255) NOT NULL,
  `teacher_gender` varchar(255) NOT NULL,
  `teacher_birthday` date NOT NULL,
  `teacher_racial` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
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
) ENGINE=InnoDB AUTO_INCREMENT=100111 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher_info
-- ----------------------------
INSERT INTO `teacher_info` VALUES ('100101', 'ylg', '男', '1979-09-17', '汉', '广东省广州市', '已婚', '2010-09-17', '硕士', null, '12345678', '12345678910', '123@qq.com', '教师', '无', null);
INSERT INTO `teacher_info` VALUES ('100102', '张国华', '女', '1980-05-23', '汉', '广东省深圳市', '已婚', '1990-03-12', '本科', '', '15968582473', '15258695452', '2045595220@qq.com', '教师', '优秀', null);
INSERT INTO `teacher_info` VALUES ('100103', '邓池潮', '男', '1976-05-06', '汉', '广东省广州市', '已婚', '2009-09-17', '硕士', null, '21035698', '15204896653', '998652336@qq.com', '教师', '无', null);
INSERT INTO `teacher_info` VALUES ('100104', '焦俊', '男', '1983-10-23', '汉', '广东省潮州市', '已婚', '1995-03-23', '本科', '', '15468782470', '13265695452', '1235595220@qq.com', '教师', '优秀', null);
INSERT INTO `teacher_info` VALUES ('100105', '卢生', '男', '1985-12-23', '汉', '广东省江门市', '已婚', '1998-01-20', '本科', '', '15398782475', '13563695452', '1245695221@qq.com', '教师', '无', null);
INSERT INTO `teacher_info` VALUES ('100106', '王振', '女', '1989-01-13', '汉', '广东省广州市', '已婚', '1998-10-23', '本科', '', '15358762473', '12563698452', '1345695221@qq.com', '教师', '无', null);
INSERT INTO `teacher_info` VALUES ('100107', '刘佳红', '男', '1987-06-14', '汉', '广东省潮州市', '已婚', '1992-03-14', '硕士', '', '17825842058', '13684839938', '1525285912@qq.com', '教师', '优秀', null);
INSERT INTO `teacher_info` VALUES ('100108', '黄佳玲', '女', '1988-05-23', '汉', '湖北省荆门市', '已婚', '1995-03-25', '硕士', '', '13525862058', '13683859438', '1623285912@163.com', '教师', '无', null);
INSERT INTO `teacher_info` VALUES ('100109', '赵东城', '男', '1989-01-18', '汉', '湖南省长沙市', '已婚', '1998-10-25', '本科', '', '13521262087', '13643669438', '7623285852@163.com', '教师', '无', null);
INSERT INTO `teacher_info` VALUES ('100110', '李青', '男', '1994-11-09', '汉', '湖北省黄冈市', '已婚', '1997-04-26', '博士', '', '13745262182', '13343769431', '2623225851@163.com', '教师', '无', null);
