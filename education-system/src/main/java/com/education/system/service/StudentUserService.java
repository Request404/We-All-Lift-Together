package com.education.system.service;


import com.education.system.entity.StudentAccount;
import com.education.system.entity.StudentInfo;

import java.util.List;


public interface StudentUserService extends BaseUserService<StudentAccount,StudentInfo> {

    public List<StudentInfo> queryStudentByClass(String studentClass);


}
