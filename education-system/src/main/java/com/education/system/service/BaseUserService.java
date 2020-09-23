package com.education.system.service;

import com.education.system.entity.TeacherAccount;
import com.education.system.entity.TeacherInfo;

import java.util.List;

public interface BaseUserService<T,U> {
    //按照id查询状态
    public Integer queryAccountStatus(Integer id);

    //验证用户信息是否匹配
    public boolean queryAccountInfoMatch(T t);

    //按照id、密码登录
    public boolean userLogin(T t);

    //查询所有账户
    public List<T> queryAllAccount();

    //修改账户信息
    public Integer alterAccountInfo(T t);

    //创建账户
    public Integer createAccount(T t);

    //按照id查询信息
    public U queryInfoById(Integer id);

    //按照id信息
    public Integer alterInfoById(U u);

    //新建信息
    public Integer insertInfo(U u);

    //查询所有信息
    public List<U> queryAllInfo();

    //按照查询用户是否存在
    public boolean queryIdIsExist(Integer id);
}
