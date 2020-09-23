package com.education.system.service.impl;

import com.education.system.entity.TeacherAccount;
import com.education.system.entity.TeacherAccountExample;
import com.education.system.entity.TeacherInfo;
import com.education.system.entity.TeacherInfoExample;
import com.education.system.mapper.TeacherAccountMapper;
import com.education.system.mapper.TeacherInfoMapper;
import com.education.system.service.TeacherUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherUserServiceImpl implements TeacherUserService {

    @Autowired
    TeacherAccountMapper teacherAccountMapper;

    @Autowired
    TeacherInfoMapper teacherInfoMapper;

    @Override
    public Integer queryAccountStatus(Integer teacherId) {
        TeacherAccount teacherAccount = teacherAccountMapper.selectByPrimaryKey(teacherId);
        if(teacherAccount!=null){
            return teacherAccount.getTeacherStatus();
        }else {
            return 0;
        }
    }

    @Override
    public boolean queryAccountInfoMatch(TeacherAccount teacherAccount) {
        TeacherAccountExample example = new TeacherAccountExample();
        example.createCriteria().andTeacherIdEqualTo(teacherAccount.getTeacherId()).andTeacherEmailEqualTo(teacherAccount.getTeacherEmail());
        List<TeacherAccount> accounts = teacherAccountMapper.selectByExample(example);
        return accounts.size() != 0;
    }

    @Override
    public boolean userLogin(TeacherAccount teacherAccount) {
        TeacherAccountExample example = new TeacherAccountExample();
        example.createCriteria().andTeacherIdEqualTo(teacherAccount.getTeacherId()).andTeacherPasswordEqualTo(teacherAccount.getTeacherPassword());
        List<TeacherAccount> accounts = teacherAccountMapper.selectByExample(example);
        return accounts.size() != 0;
    }

    @Override
    public List<TeacherAccount> queryAllAccount() {
        TeacherAccountExample example = new TeacherAccountExample();
        example.setOrderByClause("teacher_id DESC");
        List<TeacherAccount> accounts = teacherAccountMapper.selectByExample(example);
        return accounts;
    }

    @Override
    public Integer alterAccountInfo(TeacherAccount teacherAccount) {
        return teacherAccountMapper.updateByPrimaryKeySelective(teacherAccount);
    }

    @Override
    public Integer createAccount(TeacherAccount teacherAccount) {
        return teacherAccountMapper.insertSelective(teacherAccount);
    }

    @Override
    public TeacherInfo queryInfoById(Integer id) {
        return teacherInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer alterInfoById(TeacherInfo teacherInfo) {
        return teacherInfoMapper.updateByPrimaryKeySelective(teacherInfo);
    }

    @Override
    public Integer insertInfo(TeacherInfo teacherInfo) {
        return teacherInfoMapper.insertSelective(teacherInfo);
    }

    @Override
    public List<TeacherInfo> queryAllInfo() {
        TeacherInfoExample example = new TeacherInfoExample();
        example.setOrderByClause("teacher_id DESC");
        List<TeacherInfo> infos = teacherInfoMapper.selectByExample(example);
        return infos;
    }

    @Override
    public boolean queryIdIsExist(Integer id) {
        TeacherInfo teacherInfo = teacherInfoMapper.selectByPrimaryKey(id);
        return teacherInfo==null;
    }
}
