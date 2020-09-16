package com.education.system.mapper;

import com.education.system.entity.StudentAccount;
import com.education.system.entity.StudentAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_account
     *
     * @mbggenerated
     */
    int countByExample(StudentAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_account
     *
     * @mbggenerated
     */
    int deleteByExample(StudentAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_account
     *
     * @mbggenerated
     */
    int insert(StudentAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_account
     *
     * @mbggenerated
     */
    int insertSelective(StudentAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_account
     *
     * @mbggenerated
     */
    List<StudentAccount> selectByExample(StudentAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_account
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") StudentAccount record, @Param("example") StudentAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_account
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") StudentAccount record, @Param("example") StudentAccountExample example);
}