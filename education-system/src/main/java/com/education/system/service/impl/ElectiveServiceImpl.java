package com.education.system.service.impl;

import com.education.system.entity.ElectiveData;
import com.education.system.entity.ElectiveDataExample;
import com.education.system.entity.StudentElective;
import com.education.system.entity.StudentElectiveExample;
import com.education.system.mapper.ElectiveDataMapper;
import com.education.system.mapper.StudentElectiveMapper;
import com.education.system.service.ElectiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ElectiveServiceImpl implements ElectiveService {

    @Autowired
    ElectiveDataMapper electiveDataMapper;

    @Autowired
    StudentElectiveMapper studentElectiveMapper;

    @Override
    public List<ElectiveData> queryAllElective() {
        ElectiveDataExample example = new ElectiveDataExample();
        example.setOrderByClause("elective_id DESC");
        return electiveDataMapper.selectByExample(example);
    }


    @Override
    public List<ElectiveData> queryElectiveByTeacherId(Integer teacherId) {
        ElectiveDataExample example = new ElectiveDataExample();
        example.createCriteria().andTeacherIdEqualTo(teacherId);
        return electiveDataMapper.selectByExample(example);
    }

    @Override
    public Integer createElective(ElectiveData electiveData) {
        return electiveDataMapper.insertSelective(electiveData);
    }

    @Override
    public Integer updateElectiveData(ElectiveData electiveData) {
        return electiveDataMapper.updateByPrimaryKeySelective(electiveData);
    }

    @Override
    public Integer removeElective(Integer electiveId) {
        return electiveDataMapper.deleteByPrimaryKey(electiveId);
    }

    @Override
    public List<StudentElective> queryAllStudentElective() {
        StudentElectiveExample example = new StudentElectiveExample();
        example.setOrderByClause("elective_id DESC,student_id DESC");
        return studentElectiveMapper.selectByExample(example);
    }

    @Override
    public List<StudentElective> queryStudentElectiveByStudentId(Integer studentId) {
        StudentElectiveExample example = new StudentElectiveExample();
        example.createCriteria().andStudentIdEqualTo(studentId);
        return studentElectiveMapper.selectByExample(example);
    }

    @Override
    public List<StudentElective> queryStudentElectiveByElectiveId(Integer electiveId) {
        StudentElectiveExample example = new StudentElectiveExample();
        example.createCriteria().andElectiveIdEqualTo(electiveId);
        return studentElectiveMapper.selectByExample(example);
    }

    @Override
    public Integer updateStudentElective(StudentElective studentElective) {
        StudentElectiveExample example = new StudentElectiveExample();
        example.createCriteria().andStudentIdEqualTo(studentElective.getStudentId()).andElectiveIdEqualTo(studentElective.getElectiveId());
        return studentElectiveMapper.updateByExampleSelective(studentElective,example);
    }

    @Override
    public Integer createStudentElective(StudentElective studentElective) {
        return studentElectiveMapper.insertSelective(studentElective);
    }
}
