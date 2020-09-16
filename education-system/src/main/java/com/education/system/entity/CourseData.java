package com.education.system.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class CourseData implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_table.course_id
     *
     * @mbggenerated
     */
    private Integer courseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_table.teacher_id
     *
     * @mbggenerated
     */
    private Integer teacherId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_table.teacher_name
     *
     * @mbggenerated
     */
    private String teacherName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_table.course_name
     *
     * @mbggenerated
     */
    private String courseName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_table.start_time
     *
     * @mbggenerated
     */
    private String startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_table.end_time
     *
     * @mbggenerated
     */
    private String endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_table.class_name
     *
     * @mbggenerated
     */
    private String className;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_table.course_credit
     *
     * @mbggenerated
     */
    private BigDecimal courseCredit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_table.course_date
     *
     * @mbggenerated
     */
    private String courseDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_table.course_sessions
     *
     * @mbggenerated
     */
    private Integer courseSessions;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table course_table
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_table.course_id
     *
     * @return the value of course_table.course_id
     *
     * @mbggenerated
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_table.course_id
     *
     * @param courseId the value for course_table.course_id
     *
     * @mbggenerated
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_table.teacher_id
     *
     * @return the value of course_table.teacher_id
     *
     * @mbggenerated
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_table.teacher_id
     *
     * @param teacherId the value for course_table.teacher_id
     *
     * @mbggenerated
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_table.teacher_name
     *
     * @return the value of course_table.teacher_name
     *
     * @mbggenerated
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_table.teacher_name
     *
     * @param teacherName the value for course_table.teacher_name
     *
     * @mbggenerated
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_table.course_name
     *
     * @return the value of course_table.course_name
     *
     * @mbggenerated
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_table.course_name
     *
     * @param courseName the value for course_table.course_name
     *
     * @mbggenerated
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_table.start_time
     *
     * @return the value of course_table.start_time
     *
     * @mbggenerated
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_table.start_time
     *
     * @param startTime the value for course_table.start_time
     *
     * @mbggenerated
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_table.end_time
     *
     * @return the value of course_table.end_time
     *
     * @mbggenerated
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_table.end_time
     *
     * @param endTime the value for course_table.end_time
     *
     * @mbggenerated
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_table.class_name
     *
     * @return the value of course_table.class_name
     *
     * @mbggenerated
     */
    public String getClassName() {
        return className;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_table.class_name
     *
     * @param className the value for course_table.class_name
     *
     * @mbggenerated
     */
    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_table.course_credit
     *
     * @return the value of course_table.course_credit
     *
     * @mbggenerated
     */
    public BigDecimal getCourseCredit() {
        return courseCredit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_table.course_credit
     *
     * @param courseCredit the value for course_table.course_credit
     *
     * @mbggenerated
     */
    public void setCourseCredit(BigDecimal courseCredit) {
        this.courseCredit = courseCredit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_table.course_date
     *
     * @return the value of course_table.course_date
     *
     * @mbggenerated
     */
    public String getCourseDate() {
        return courseDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_table.course_date
     *
     * @param courseDate the value for course_table.course_date
     *
     * @mbggenerated
     */
    public void setCourseDate(String courseDate) {
        this.courseDate = courseDate == null ? null : courseDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_table.course_sessions
     *
     * @return the value of course_table.course_sessions
     *
     * @mbggenerated
     */
    public Integer getCourseSessions() {
        return courseSessions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_table.course_sessions
     *
     * @param courseSessions the value for course_table.course_sessions
     *
     * @mbggenerated
     */
    public void setCourseSessions(Integer courseSessions) {
        this.courseSessions = courseSessions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_table
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", courseId=").append(courseId);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", teacherName=").append(teacherName);
        sb.append(", courseName=").append(courseName);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", className=").append(className);
        sb.append(", courseCredit=").append(courseCredit);
        sb.append(", courseDate=").append(courseDate);
        sb.append(", courseSessions=").append(courseSessions);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}