package com.education.system.controller;

import com.education.system.entity.TeacherAccount;
import com.education.system.entity.TeacherInfo;
import com.education.system.service.TeacherUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherUserService teacherUserService;


    @GetMapping("/queryAccountStatus")
    public Integer queryAccountStatus(Integer teacherId) {
        return teacherUserService.queryAccountStatus(teacherId);
    }

    @PostMapping("/queryAccountInfoMatch")
    public boolean queryAccountInfoMatch(@RequestBody TeacherAccount teacherAccount) {
        return teacherUserService.queryAccountInfoMatch(teacherAccount);
    }

    @PostMapping("/userLogin")
    public boolean userLogin(@RequestBody TeacherAccount teacherAccount) {
        return teacherUserService.userLogin(teacherAccount);
    }

    @PostMapping("/alterAccountInfo")
    public Integer alterAccountInfo(@RequestBody TeacherAccount teacherAccount) {
        return teacherUserService.alterAccountInfo(teacherAccount);
    }

    @PostMapping("/createAccount")
    public Integer createAccount(@RequestBody TeacherAccount teacherAccount) {
        return teacherUserService.createAccount(teacherAccount);
    }

    @GetMapping("/queryInfoById")
    public TeacherInfo queryInfoById(Integer id) {
        return teacherUserService.queryInfoById(id);
    }

    @PostMapping("/alterInfoById")
    public Integer alterInfoById(@RequestBody TeacherInfo teacherInfo) {
        return teacherUserService.alterInfoById(teacherInfo);
    }

    @PostMapping("/insertInfo")
    public Integer insertInfo(TeacherInfo teacherInfo) {
        return teacherUserService.insertInfo(teacherInfo);
    }

    @GetMapping("/queryIdIsExist")
    public  boolean queryIdIsExist(Integer id){
        return teacherUserService.queryIdIsExist(id);
    }

}
