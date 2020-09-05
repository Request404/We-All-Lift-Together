package com.system.teach.mapper;

import com.system.teach.pojo.StudentAccount;
import com.system.teach.pojo.TeacherAccount;
import com.system.teach.pojo.TeacherInfo;

public interface TeacherMapper {

    //按照id查询教师信息
    public TeacherInfo queryTeacherInfoById(Integer teacherId);

    //创建教师信息
    public boolean createTeacherInfo(TeacherInfo teacherInfo);

    //按照id修改教师信息
    public boolean updateTeacherInfoById(TeacherInfo teacherInfo);

    //注销教师账号
    //public boolean removeTeacherById(Integer teacherId);

    //按照邮箱查询教师是否存在
    public boolean queryTeacherExistAsEmail(String Email);

    //登录教师账户
    public boolean loginTeacherAccount(TeacherAccount teacherAccount);

    //更新教师账户
    public boolean updateTeacherAccount(TeacherAccount teacherAccount);

}
