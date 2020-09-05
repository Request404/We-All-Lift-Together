package com.system.teach.mapper;

import com.system.teach.pojo.StudentAccount;
import com.system.teach.pojo.StudentInfo;
import com.system.teach.pojo.TeacherInfo;

public interface StudentMapper {

    //按照学生Id查询学生信息
    public StudentInfo queryStudentInfoById(Integer studentId);

    //创建学生信息
    public boolean createStudentInfo(TeacherInfo teacherInfo);

    //按照Id修改学生信息
    public boolean updateStudentInfoById(TeacherInfo teacherInfo);

    //按照Id移除学生
    //public boolean removeStudentById(Integer id);

    //按照邮箱查询学生是否存在
    public boolean queryStudentExistAsEmail(String Email);

    //登录学生账户
    public boolean loginStudentAccount(StudentAccount studentAccount);

    //更新学生账户
    public boolean updateStudentAccount(StudentAccount studentAccount);



}
