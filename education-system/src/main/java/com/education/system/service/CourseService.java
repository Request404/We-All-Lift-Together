package com.education.system.service;

import com.education.system.entity.CourseData;
import com.education.system.entity.StudentTranscript;

import java.util.List;


public interface CourseService {
    //按照学生Id查询课程
    public List<CourseData> queryCourseByStudentClass(String studentClass);

    //按照教师Id查询课程
    public List<CourseData> queryCourseByTeacherId(Integer teacherId);

    //查询所有课程
    public List<CourseData> queryAllCourse();

    //创建课程
    public Integer createCourse(CourseData courseData);

    //修改课程信息
    public Integer updateCourseById(CourseData courseData);

    //移除课程
    public Integer removeCourse(Integer courseId);

    //按照学生id查询学生成绩
    public List<StudentTranscript> queryTranscriptByStudentId(Integer studentId);

    //按照教师id查询相关学生成绩
    public List<StudentTranscript> queryTranscriptByTeacherId(Integer teacherId);

    //按照课程id查询学生成绩
    public List<StudentTranscript> queryTranscriptByCourseId(Integer courseId);

    //查询所有学生成绩
    public List<StudentTranscript> queryAllTranscript();

    //更新学生成绩信息
    public Integer updateTranscript(StudentTranscript transcript);

    //成绩学生成绩信息
    public Integer createTranscript(StudentTranscript transcript);
}
