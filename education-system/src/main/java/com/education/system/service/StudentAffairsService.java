package com.education.system.service;

import com.education.system.entity.StudentAffairs;

import java.util.List;

public interface StudentAffairsService {

    //事务的申请
    public boolean affairsApplication(StudentAffairs affairs);

    //事务撤回
    public Integer callBackAffairs(Integer affairsId);

    //按照学生id查询事务
    public List<StudentAffairs> queryAffairsByStudent(Integer studentId);

    //按照教师id查询要处理的事务
    public List<StudentAffairs> queryAffairsByTeacher(Integer teacherId);

    //按照事务id修改事务信息
    public Integer alterAffairsInfo(StudentAffairs studentAffairs);

    //查询所有事务
    public List<StudentAffairs> queryAllAffairs();
}
