package com.education.system.service;

import com.education.system.entity.ElectiveData;
import com.education.system.entity.StudentElective;

import java.util.List;

public interface ElectiveService {

    //查询所有选课
    public List<ElectiveData> queryAllElective();

    //按照教师id查询选课
    public List<ElectiveData> queryElectiveByTeacherId(Integer teacherId);

    //选课录入
    public Integer createElective(ElectiveData electiveData);

    //选课信息更新
    public Integer updateElectiveData(ElectiveData electiveData);

    //移除选课
    public Integer removeElective(Integer electiveId);

    //查询所有学生选课情况
    public List<StudentElective> queryAllStudentElective();

    //按照学生id查询选课情况
    public List<StudentElective> queryStudentElectiveByStudentId(Integer studentId);

    //按照课程id查询学生选课
    public List<StudentElective> queryStudentElectiveByElectiveId(Integer electiveId);

    //更新选课信息
    public Integer updateStudentElective(StudentElective studentElective);

    //创建选课信息
    public Integer createStudentElective(StudentElective studentElective);
}
