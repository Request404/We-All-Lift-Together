package com.education.system.service.impl;

import com.education.system.entity.AdminAccount;
import com.education.system.entity.AdminAccountExample;
import com.education.system.mapper.AdminAccountMapper;
import com.education.system.service.AdministrationUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministrationUserServiceImpl implements AdministrationUserService {

    @Autowired
    AdminAccountMapper adminAccountMapper;

    @Override
    public Integer queryAccountStatus(Integer id) {
        AdminAccount adminAccount = adminAccountMapper.selectByPrimaryKey(id);
        if(adminAccount!=null){
            return adminAccount.getAdminStatus();
        }else {
            return 0;
        }
    }

    @Override
    public boolean queryAccountInfoMatch(AdminAccount adminAccount) {
        AdminAccountExample example = new AdminAccountExample();
        example.createCriteria().andAdminIdEqualTo(adminAccount.getAdminId()).andAdminEmailEqualTo(adminAccount.getAdminEmail());
        List<AdminAccount> accounts = adminAccountMapper.selectByExample(example);
        return accounts.size() != 0;
    }

    @Override
    public boolean userLogin(AdminAccount adminAccount) {
        AdminAccountExample example = new AdminAccountExample();
        example.createCriteria().andAdminIdEqualTo(adminAccount.getAdminId()).andAdminPasswordEqualTo(adminAccount.getAdminPassword());
        List<AdminAccount> accounts = adminAccountMapper.selectByExample(example);
        return accounts.size() != 0;
    }

    @Override
    public List<AdminAccount> queryAllAccount() {
        return null;
    }

    @Override
    public Integer alterAccountInfo(AdminAccount adminAccount) {
        return adminAccountMapper.updateByPrimaryKeySelective(adminAccount);
    }

    @Override
    public Integer createAccount(AdminAccount adminAccount) {
        return adminAccountMapper.insertSelective(adminAccount);
    }

    @Override
    public AdminAccount queryAdministrationInfo(Integer adminId) {
        return adminAccountMapper.selectByPrimaryKey(adminId);
    }

    @Override
    public boolean queryIdIsExist(Integer id) {
        AdminAccount account = adminAccountMapper.selectByPrimaryKey(id);
        return account==null;
    }

    //无管理员信息
    @Override
    public Object queryInfoById(Integer id) {
        return null;
    }

    @Override
    public Integer alterInfoById(Object o) {
        return null;
    }

    @Override
    public Integer insertInfo(Object o) {
        return null;
    }

    @Override
    public List<Object> queryAllInfo() {
        return null;
    }


}
