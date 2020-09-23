package com.education.system.controller;


import com.education.system.entity.StudentAccount;
import com.education.system.entity.StudentInfo;
import com.education.system.service.StudentUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/student")
@CrossOrigin
@RestController
public class StudentController {

    @Autowired
    StudentUserService studentService;

    @GetMapping("/queryAccountStatus")
    public Integer queryAccountStatus(Integer studentId) {
        return studentService.queryAccountStatus(studentId);
    }


    @PostMapping("/queryAccountInfoMatch")
    public boolean queryAccountInfoMatch(@RequestBody StudentAccount studentAccount) {
        return studentService.queryAccountInfoMatch(studentAccount);
    }

    @PostMapping("/userLogin")
    public boolean userLogin(@RequestBody StudentAccount studentAccount){
        return studentService.userLogin(studentAccount);
    }

    @GetMapping("/queryAllAccount")
    public List<StudentAccount> queryAllAccount(){
        return studentService.queryAllAccount();
    }

    @PostMapping("/alterAccountInfo")
    public Integer alterAccountInfo(@RequestBody StudentAccount studentAccount) {
        return studentService.alterAccountInfo(studentAccount);
    }

    @PostMapping("/createAccount")
    public Integer createAccount(@RequestBody StudentAccount studentAccount) {
        return studentService.createAccount(studentAccount);
    }

    @GetMapping("/queryInfoById")
    public StudentInfo queryInfoById(Integer id) {
        return studentService.queryInfoById(id);
    }

    @PostMapping("/alterInfoById")
    public Integer alterInfoById(@RequestBody StudentInfo studentInfo) {
        return studentService.alterInfoById(studentInfo);
    }

    @PostMapping("/insertInfo")
    public Integer insertInfo(@RequestBody StudentInfo studentInfo) {
        return studentService.insertInfo(studentInfo);
    }

    @GetMapping("/queryStudentByClass")
    public List<StudentInfo> queryStudentByClass(String studentClass) {
        return studentService.queryStudentByClass(studentClass);
    }

    @GetMapping("/queryAllInfo")
    public List<StudentInfo> queryAllInfo(){
        return studentService.queryAllInfo();
    }

    @GetMapping("/queryIdIsExist")
    public  boolean queryIdIsExist(Integer id){
        return studentService.queryIdIsExist(id);
    }
}
