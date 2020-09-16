package com.world.education.mapper;

import com.world.education.entity.StudentElective;
import com.world.education.entity.StudentElectiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentElectiveMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_elective
     *
     * @mbggenerated
     */
    int countByExample(StudentElectiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_elective
     *
     * @mbggenerated
     */
    int deleteByExample(StudentElectiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_elective
     *
     * @mbggenerated
     */
    int insert(StudentElective record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_elective
     *
     * @mbggenerated
     */
    int insertSelective(StudentElective record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_elective
     *
     * @mbggenerated
     */
    List<StudentElective> selectByExample(StudentElectiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_elective
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") StudentElective record, @Param("example") StudentElectiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_elective
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") StudentElective record, @Param("example") StudentElectiveExample example);
}