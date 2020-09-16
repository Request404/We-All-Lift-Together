package com.education.system.service.impl;

import com.education.system.entity.StudentAffairs;
import com.education.system.entity.StudentAffairsExample;
import com.education.system.mapper.StudentAffairsMapper;
import com.education.system.service.StudentAffairsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentAffairsServiceImpl implements StudentAffairsService {

    @Autowired
    StudentAffairsMapper studentAffairsMapper;

    @Override
    public boolean affairsApplication(StudentAffairs affairs) {
        int i = studentAffairsMapper.insertSelective(affairs);
        return i>0;
    }

    @Override
    public Integer callBackAffairs(Integer affairsId) {
       return studentAffairsMapper.deleteByPrimaryKey(affairsId);
    }

    @Override
    public List<StudentAffairs> queryAffairsByStudent(Integer studentId) {
        StudentAffairsExample example = new StudentAffairsExample();
        example.createCriteria().andStudentIdEqualTo(studentId);
        List<StudentAffairs> affairs = studentAffairsMapper.selectByExample(example);
        return affairs;
    }

    @Override
    public List<StudentAffairs> queryAffairsByTeacher(Integer teacherId) {
        StudentAffairsExample example = new StudentAffairsExample();
        example.createCriteria().andHandleTeacherIdEqualTo(teacherId);
        List<StudentAffairs> affairs = studentAffairsMapper.selectByExample(example);
        return affairs;
    }

    @Override
    public Integer alterAffairsInfo(StudentAffairs studentAffairs) {
        return studentAffairsMapper.updateByPrimaryKey(studentAffairs);
    }

    @Override
    public List<StudentAffairs> queryAllAffairs() {
        StudentAffairsExample example = new StudentAffairsExample();
        example.setOrderByClause("affairs_id DESC");
        return studentAffairsMapper.selectByExample(example);
    }
}
