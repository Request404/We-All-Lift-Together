package com.education.system.controller;

import com.education.system.entity.CourseData;
import com.education.system.entity.StudentTranscript;
import com.education.system.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/queryCourseByStudentClass")
    public List<CourseData> queryCourseByStudentClass(String studentClass) {
        return courseService.queryCourseByStudentClass(studentClass);
    }

    @GetMapping("/queryCourseByTeacherId")
    public List<CourseData> queryCourseByTeacherId(Integer teacherId) {
        return courseService.queryCourseByTeacherId(teacherId);
    }

    @GetMapping("/queryAllCourse")
    public List<CourseData> queryAllCourse() {
        return courseService.queryAllCourse();
    }

    @PostMapping("/createCourse")
    public Integer createCourse(@RequestBody CourseData courseData) {
        return courseService.createCourse(courseData);
    }

    @PostMapping("/updateCourseById")
    public Integer updateCourseById(@RequestBody CourseData courseData) {
        return courseService.updateCourseById(courseData);
    }

    @PostMapping("/removeCourse")
    public Integer removeCourse(@RequestBody Integer courseId) {
        return courseService.removeCourse(courseId);
    }

    @GetMapping("/queryTranscriptByStudentId")
    public List<StudentTranscript> queryTranscriptByStudentId(Integer studentId) {
        return courseService.queryTranscriptByStudentId(studentId);
    }

    @GetMapping("/queryTranscriptByTeacherId")
    public List<StudentTranscript> queryTranscriptByTeacherId(Integer teacherId) {
        return courseService.queryTranscriptByTeacherId(teacherId);
    }

    @GetMapping("/queryTranscriptByCourseId")
    public List<StudentTranscript> queryTranscriptByCourseId(Integer courseId) {
        return courseService.queryTranscriptByCourseId(courseId);
    }

    @GetMapping("/queryAllTranscript")
    public List<StudentTranscript> queryAllTranscript() {
        return courseService.queryAllTranscript();
    }

    @PostMapping("/updateTranscript")
    public Integer updateTranscript(@RequestBody StudentTranscript transcript) {
        return courseService.updateTranscript(transcript);
    }

    @PostMapping("/createTranscript")
    public Integer createTranscript(@RequestBody StudentTranscript transcript) {
        return courseService.createTranscript(transcript);
    }
}
