package com.education.system.service.impl;

import com.education.system.entity.CourseData;
import com.education.system.entity.CourseDataExample;
import com.education.system.entity.StudentTranscript;
import com.education.system.entity.StudentTranscriptExample;
import com.education.system.mapper.CourseDataMapper;
import com.education.system.mapper.StudentTranscriptMapper;
import com.education.system.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseDataMapper courseDataMapper;

    @Autowired
    StudentTranscriptMapper studentTranscriptMapper;

    
    @Override
    public List<CourseData> queryCourseByStudentClass(String studentClass) {
        CourseDataExample example = new CourseDataExample();
        example.createCriteria().andClassNameEqualTo(studentClass);
        return courseDataMapper.selectByExample(example);
    }

    @Override
    public List<CourseData> queryCourseByTeacherId(Integer teacherId) {
        CourseDataExample example = new CourseDataExample();
        example.createCriteria().andTeacherIdEqualTo(teacherId);
        return courseDataMapper.selectByExample(example);
    }

    @Override
    public List<CourseData> queryAllCourse() {
        CourseDataExample example = new CourseDataExample();
        example.setOrderByClause("course_id DESC");
        return courseDataMapper.selectByExample(example);
    }

    @Override
    public Integer createCourse(CourseData courseData) {
        return courseDataMapper.insertSelective(courseData);
    }

    @Override
    public Integer updateCourseById(CourseData courseData) {
        return courseDataMapper.updateByPrimaryKeySelective(courseData);
    }

    @Override
    public Integer removeCourse(Integer courseId) {
        return courseDataMapper.deleteByPrimaryKey(courseId);
    }

    @Override
    public List<StudentTranscript> queryTranscriptByStudentId(Integer studentId) {
        StudentTranscriptExample example = new StudentTranscriptExample();
        example.createCriteria().andStudentIdEqualTo(studentId);
        return studentTranscriptMapper.selectByExample(example);
    }

    @Override
    public List<StudentTranscript> queryTranscriptByTeacherId(Integer teacherId) {
        StudentTranscriptExample example = new StudentTranscriptExample();
        example.createCriteria().andTeacherIdEqualTo(teacherId);
        return studentTranscriptMapper.selectByExample(example);
    }

    @Override
    public List<StudentTranscript> queryTranscriptByCourseId(Integer courseId) {
        StudentTranscriptExample example = new StudentTranscriptExample();
        example.createCriteria().andCourseIdEqualTo(courseId);
        return studentTranscriptMapper.selectByExample(example);
    }

    @Override
    public List<StudentTranscript> queryAllTranscript() {
        StudentTranscriptExample example = new StudentTranscriptExample();
        example.setOrderByClause("student_id DESC");
        return studentTranscriptMapper.selectByExample(example);
    }

    @Override
    public Integer updateTranscript(StudentTranscript transcript) {
        StudentTranscriptExample example = new StudentTranscriptExample();
        example.createCriteria().andCourseIdEqualTo(transcript.getCourseId()).andStudentIdEqualTo(transcript.getStudentId());
        return studentTranscriptMapper.updateByExampleSelective(transcript,example);
    }

    @Override
    public Integer createTranscript(StudentTranscript transcript) {
        return studentTranscriptMapper.insertSelective(transcript);
    }
}
