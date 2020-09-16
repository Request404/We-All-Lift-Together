package com.education.system.service.impl;

import com.education.system.entity.StudentAccount;
import com.education.system.entity.StudentAccountExample;
import com.education.system.entity.StudentInfo;
import com.education.system.entity.StudentInfoExample;
import com.education.system.mapper.StudentAccountMapper;
import com.education.system.mapper.StudentInfoMapper;
import com.education.system.service.StudentUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentUserServiceImpl implements StudentUserService {

    @Autowired
    private StudentAccountMapper studentAccountMapper;

    @Autowired
    private StudentInfoMapper studentInfoMapper;

    @Override
    public Integer queryAccountStatus(Integer studentId) {
        StudentAccountExample example = new StudentAccountExample();
        example.createCriteria().andStudentIdEqualTo(studentId);
        List<StudentAccount> list = studentAccountMapper.selectByExample(example);
        if (list != null) {
            return list.get(0).getStudentStatus();
        } else {
            return 0;
        }
    }

    @Override
    public boolean queryAccountInfoMatch(StudentAccount studentAccount) {
        StudentAccountExample example = new StudentAccountExample();
        example.createCriteria().andStudentIdEqualTo(studentAccount.getStudentId()).andStudentEmailEqualTo(studentAccount.getStudentEmail());
        List<StudentAccount> accounts = studentAccountMapper.selectByExample(example);
        if(accounts!=null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean userLogin(StudentAccount studentAccount) {
        StudentAccountExample example = new StudentAccountExample();
        example.createCriteria().andStudentIdEqualTo(studentAccount.getStudentId()).andStudentPasswordEqualTo(studentAccount.getStudentPassword());
        List<StudentAccount> list = studentAccountMapper.selectByExample(example);
        return list.get(0) != null;
    }

    @Override
    public Integer alterAccountInfo(StudentAccount studentAccount) {
        StudentAccountExample example = new StudentAccountExample();
        example.createCriteria().andStudentIdEqualTo(studentAccount.getStudentId());
        return studentAccountMapper.updateByExampleSelective(studentAccount, example);
    }

    @Override
    public Integer createAccount(StudentAccount studentAccount) {
        return studentAccountMapper.insertSelective(studentAccount);
    }

    @Override
    public StudentInfo queryInfoById(Integer id) {
        return studentInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer alterInfoById(StudentInfo studentInfo) {
        return studentInfoMapper.updateByPrimaryKey(studentInfo);
    }

    @Override
    public Integer insertInfo(StudentInfo studentInfo) {
        return studentInfoMapper.insertSelective(studentInfo);
    }

    @Override
    public boolean queryIdIsExist(Integer id) {
        StudentInfo studentInfo = studentInfoMapper.selectByPrimaryKey(id);
        return studentInfo==null;
    }

    @Override
    public List<StudentInfo> queryStudentByClass(String studentClass) {
        StudentInfoExample example = new StudentInfoExample();
        example.createCriteria().andStudentClassEqualTo(studentClass);
        example.setOrderByClause("student_id DESC");
        return studentInfoMapper.selectByExample(example);

    }



}