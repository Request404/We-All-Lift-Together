package com.system.teach.controller;

import com.system.teach.mapper.StudentMapper;
import com.system.teach.pojo.StudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentMapper studentMapper;


    @GetMapping("queryStudentInfoById")
    public StudentInfo queryStudentInfoById(Integer studentId){
        return studentMapper.queryStudentInfoById(studentId);
    }

}
