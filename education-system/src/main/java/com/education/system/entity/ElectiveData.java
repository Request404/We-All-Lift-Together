package com.education.system.entity;

import java.io.Serializable;

public class ElectiveData implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column elective_table.elective_id
     *
     * @mbggenerated
     */
    private Integer electiveId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column elective_table.elective_name
     *
     * @mbggenerated
     */
    private String electiveName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column elective_table.teacher_id
     *
     * @mbggenerated
     */
    private Integer teacherId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column elective_table.teacher_name
     *
     * @mbggenerated
     */
    private String teacherName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column elective_table.elective_start_time
     *
     * @mbggenerated
     */
    private String electiveStartTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column elective_table.elective_end_time
     *
     * @mbggenerated
     */
    private String electiveEndTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column elective_table.elective_date
     *
     * @mbggenerated
     */
    private String electiveDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column elective_table.elective_sessions
     *
     * @mbggenerated
     */
    private Integer electiveSessions;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column elective_table.elective_credit
     *
     * @mbggenerated
     */
    private Long electiveCredit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table elective_table
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column elective_table.elective_id
     *
     * @return the value of elective_table.elective_id
     *
     * @mbggenerated
     */
    public Integer getElectiveId() {
        return electiveId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column elective_table.elective_id
     *
     * @param electiveId the value for elective_table.elective_id
     *
     * @mbggenerated
     */
    public void setElectiveId(Integer electiveId) {
        this.electiveId = electiveId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column elective_table.elective_name
     *
     * @return the value of elective_table.elective_name
     *
     * @mbggenerated
     */
    public String getElectiveName() {
        return electiveName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column elective_table.elective_name
     *
     * @param electiveName the value for elective_table.elective_name
     *
     * @mbggenerated
     */
    public void setElectiveName(String electiveName) {
        this.electiveName = electiveName == null ? null : electiveName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column elective_table.teacher_id
     *
     * @return the value of elective_table.teacher_id
     *
     * @mbggenerated
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column elective_table.teacher_id
     *
     * @param teacherId the value for elective_table.teacher_id
     *
     * @mbggenerated
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column elective_table.teacher_name
     *
     * @return the value of elective_table.teacher_name
     *
     * @mbggenerated
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column elective_table.teacher_name
     *
     * @param teacherName the value for elective_table.teacher_name
     *
     * @mbggenerated
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column elective_table.elective_start_time
     *
     * @return the value of elective_table.elective_start_time
     *
     * @mbggenerated
     */
    public String getElectiveStartTime() {
        return electiveStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column elective_table.elective_start_time
     *
     * @param electiveStartTime the value for elective_table.elective_start_time
     *
     * @mbggenerated
     */
    public void setElectiveStartTime(String electiveStartTime) {
        this.electiveStartTime = electiveStartTime == null ? null : electiveStartTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column elective_table.elective_end_time
     *
     * @return the value of elective_table.elective_end_time
     *
     * @mbggenerated
     */
    public String getElectiveEndTime() {
        return electiveEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column elective_table.elective_end_time
     *
     * @param electiveEndTime the value for elective_table.elective_end_time
     *
     * @mbggenerated
     */
    public void setElectiveEndTime(String electiveEndTime) {
        this.electiveEndTime = electiveEndTime == null ? null : electiveEndTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column elective_table.elective_date
     *
     * @return the value of elective_table.elective_date
     *
     * @mbggenerated
     */
    public String getElectiveDate() {
        return electiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column elective_table.elective_date
     *
     * @param electiveDate the value for elective_table.elective_date
     *
     * @mbggenerated
     */
    public void setElectiveDate(String electiveDate) {
        this.electiveDate = electiveDate == null ? null : electiveDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column elective_table.elective_sessions
     *
     * @return the value of elective_table.elective_sessions
     *
     * @mbggenerated
     */
    public Integer getElectiveSessions() {
        return electiveSessions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column elective_table.elective_sessions
     *
     * @param electiveSessions the value for elective_table.elective_sessions
     *
     * @mbggenerated
     */
    public void setElectiveSessions(Integer electiveSessions) {
        this.electiveSessions = electiveSessions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column elective_table.elective_credit
     *
     * @return the value of elective_table.elective_credit
     *
     * @mbggenerated
     */
    public Long getElectiveCredit() {
        return electiveCredit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column elective_table.elective_credit
     *
     * @param electiveCredit the value for elective_table.elective_credit
     *
     * @mbggenerated
     */
    public void setElectiveCredit(Long electiveCredit) {
        this.electiveCredit = electiveCredit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table elective_table
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", electiveId=").append(electiveId);
        sb.append(", electiveName=").append(electiveName);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", teacherName=").append(teacherName);
        sb.append(", electiveStartTime=").append(electiveStartTime);
        sb.append(", electiveEndTime=").append(electiveEndTime);
        sb.append(", electiveDate=").append(electiveDate);
        sb.append(", electiveSessions=").append(electiveSessions);
        sb.append(", electiveCredit=").append(electiveCredit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}