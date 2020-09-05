package com.system.teach.controller;

import com.system.teach.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("teacher")
public class TeacherController {

    @Autowired
    TeacherMapper teacherMapper;


}
