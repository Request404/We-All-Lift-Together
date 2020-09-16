package com.education.system.controller;

import com.education.system.entity.StudentAffairs;
import com.education.system.service.StudentAffairsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/studentAffairs")
public class StudentAffairsController {

    @Autowired
    StudentAffairsService studentAffairsService;

    @PostMapping("/affairsApplication")
    public boolean affairsApplication(@RequestBody StudentAffairs affairs) {
        return studentAffairsService.affairsApplication(affairs);
    }

    @GetMapping("/callBackAffairs")
    public Integer callBackAffairs(Integer affairsId) {
        return studentAffairsService.callBackAffairs(affairsId);
    }

    @GetMapping("/queryAffairsByStudent")
    public List<StudentAffairs> queryAffairsByStudent(Integer studentId) {
        return studentAffairsService.queryAffairsByStudent(studentId);
    }

    @GetMapping("/queryAffairsByTeacher")
    public List<StudentAffairs> queryAffairsByTeacher(Integer teacherId) {
        return studentAffairsService.queryAffairsByTeacher(teacherId);
    }

    @PostMapping("/alterAffairsInfo")
    public Integer alterAffairsInfo(@RequestBody StudentAffairs studentAffairs) {
        return studentAffairsService.alterAffairsInfo(studentAffairs);
    }

    @GetMapping("/queryAllAffairs")
    public List<StudentAffairs> queryAllAffairs() {
        return studentAffairsService.queryAllAffairs();
    }
}
