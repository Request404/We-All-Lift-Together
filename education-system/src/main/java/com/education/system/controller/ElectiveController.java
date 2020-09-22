package com.education.system.controller;

import com.education.system.entity.ElectiveData;
import com.education.system.entity.StudentElective;
import com.education.system.service.ElectiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/elective")
public class ElectiveController {

    @Autowired
    ElectiveService electiveService;

    @GetMapping("/queryAllElective")
    public List<ElectiveData> queryAllElective() {
        return electiveService.queryAllElective();
    }

    @GetMapping("/queryElectiveByTeacherId")
    public List<ElectiveData> queryElectiveByTeacherId(Integer teacherId) {
        return electiveService.queryElectiveByTeacherId(teacherId);
    }

    @PostMapping("/createElective")
    public Integer createElective(@RequestBody ElectiveData electiveData) {
        return electiveService.createElective(electiveData);
    }

    @PostMapping("/updateElectiveData")
    public Integer updateElectiveData(@RequestBody ElectiveData electiveData) {
        return electiveService.updateElectiveData(electiveData);
    }

    @PostMapping("/removeElective")
    public Integer removeElective(@RequestBody Integer electiveId) {
        return electiveService.removeElective(electiveId);
    }

    @GetMapping("/queryAllStudentElective")
    public List<StudentElective> queryAllStudentElective() {
        return electiveService.queryAllStudentElective();
    }

    @GetMapping("/queryStudentElectiveByStudentId")
    public List<StudentElective> queryStudentElectiveByStudentId(Integer studentId) {
        return electiveService.queryStudentElectiveByStudentId(studentId);
    }

    @GetMapping("/queryStudentElectiveByElectiveId")
    public List<StudentElective> queryStudentElectiveByElectiveId(Integer electiveId) {
        return electiveService.queryStudentElectiveByElectiveId(electiveId);
    }

    @PostMapping("/updateStudentElective")
    public Integer updateStudentElective(@RequestBody StudentElective studentElective) {
        return electiveService.updateStudentElective(studentElective);
    }

    @PostMapping("/createStudentElective")
    public Integer createStudentElective(@RequestBody StudentElective studentElective) {
        return electiveService.createStudentElective(studentElective);
    }

}
