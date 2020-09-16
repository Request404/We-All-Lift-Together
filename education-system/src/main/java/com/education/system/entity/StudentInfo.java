package com.education.system.entity;

import java.io.Serializable;
import java.util.Date;

public class StudentInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.student_id
     *
     * @mbggenerated
     */
    private Integer studentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.student_name
     *
     * @mbggenerated
     */
    private String studentName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.student_gender
     *
     * @mbggenerated
     */
    private String studentGender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.student_birthday
     *
     * @mbggenerated
     */
    private Date studentBirthday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.student_racial
     *
     * @mbggenerated
     */
    private String studentRacial;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.student_native_place
     *
     * @mbggenerated
     */
    private String studentNativePlace;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.student_join_time
     *
     * @mbggenerated
     */
    private Date studentJoinTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.student_major
     *
     * @mbggenerated
     */
    private String studentMajor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.student_class
     *
     * @mbggenerated
     */
    private String studentClass;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.student_phone
     *
     * @mbggenerated
     */
    private Integer studentPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.student_cellphone
     *
     * @mbggenerated
     */
    private String studentCellphone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.student_address
     *
     * @mbggenerated
     */
    private String studentAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.student_emergency_contact
     *
     * @mbggenerated
     */
    private String studentEmergencyContact;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.student_contact_phone
     *
     * @mbggenerated
     */
    private String studentContactPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.student_email
     *
     * @mbggenerated
     */
    private String studentEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.student_remark
     *
     * @mbggenerated
     */
    private String studentRemark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.student_photo
     *
     * @mbggenerated
     */
    private String studentPhoto;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table student_info
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.student_id
     *
     * @return the value of student_info.student_id
     *
     * @mbggenerated
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.student_id
     *
     * @param studentId the value for student_info.student_id
     *
     * @mbggenerated
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.student_name
     *
     * @return the value of student_info.student_name
     *
     * @mbggenerated
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.student_name
     *
     * @param studentName the value for student_info.student_name
     *
     * @mbggenerated
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.student_gender
     *
     * @return the value of student_info.student_gender
     *
     * @mbggenerated
     */
    public String getStudentGender() {
        return studentGender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.student_gender
     *
     * @param studentGender the value for student_info.student_gender
     *
     * @mbggenerated
     */
    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender == null ? null : studentGender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.student_birthday
     *
     * @return the value of student_info.student_birthday
     *
     * @mbggenerated
     */
    public Date getStudentBirthday() {
        return studentBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.student_birthday
     *
     * @param studentBirthday the value for student_info.student_birthday
     *
     * @mbggenerated
     */
    public void setStudentBirthday(Date studentBirthday) {
        this.studentBirthday = studentBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.student_racial
     *
     * @return the value of student_info.student_racial
     *
     * @mbggenerated
     */
    public String getStudentRacial() {
        return studentRacial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.student_racial
     *
     * @param studentRacial the value for student_info.student_racial
     *
     * @mbggenerated
     */
    public void setStudentRacial(String studentRacial) {
        this.studentRacial = studentRacial == null ? null : studentRacial.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.student_native_place
     *
     * @return the value of student_info.student_native_place
     *
     * @mbggenerated
     */
    public String getStudentNativePlace() {
        return studentNativePlace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.student_native_place
     *
     * @param studentNativePlace the value for student_info.student_native_place
     *
     * @mbggenerated
     */
    public void setStudentNativePlace(String studentNativePlace) {
        this.studentNativePlace = studentNativePlace == null ? null : studentNativePlace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.student_join_time
     *
     * @return the value of student_info.student_join_time
     *
     * @mbggenerated
     */
    public Date getStudentJoinTime() {
        return studentJoinTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.student_join_time
     *
     * @param studentJoinTime the value for student_info.student_join_time
     *
     * @mbggenerated
     */
    public void setStudentJoinTime(Date studentJoinTime) {
        this.studentJoinTime = studentJoinTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.student_major
     *
     * @return the value of student_info.student_major
     *
     * @mbggenerated
     */
    public String getStudentMajor() {
        return studentMajor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.student_major
     *
     * @param studentMajor the value for student_info.student_major
     *
     * @mbggenerated
     */
    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor == null ? null : studentMajor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.student_class
     *
     * @return the value of student_info.student_class
     *
     * @mbggenerated
     */
    public String getStudentClass() {
        return studentClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.student_class
     *
     * @param studentClass the value for student_info.student_class
     *
     * @mbggenerated
     */
    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass == null ? null : studentClass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.student_phone
     *
     * @return the value of student_info.student_phone
     *
     * @mbggenerated
     */
    public Integer getStudentPhone() {
        return studentPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.student_phone
     *
     * @param studentPhone the value for student_info.student_phone
     *
     * @mbggenerated
     */
    public void setStudentPhone(Integer studentPhone) {
        this.studentPhone = studentPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.student_cellphone
     *
     * @return the value of student_info.student_cellphone
     *
     * @mbggenerated
     */
    public String getStudentCellphone() {
        return studentCellphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.student_cellphone
     *
     * @param studentCellphone the value for student_info.student_cellphone
     *
     * @mbggenerated
     */
    public void setStudentCellphone(String studentCellphone) {
        this.studentCellphone = studentCellphone == null ? null : studentCellphone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.student_address
     *
     * @return the value of student_info.student_address
     *
     * @mbggenerated
     */
    public String getStudentAddress() {
        return studentAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.student_address
     *
     * @param studentAddress the value for student_info.student_address
     *
     * @mbggenerated
     */
    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress == null ? null : studentAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.student_emergency_contact
     *
     * @return the value of student_info.student_emergency_contact
     *
     * @mbggenerated
     */
    public String getStudentEmergencyContact() {
        return studentEmergencyContact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.student_emergency_contact
     *
     * @param studentEmergencyContact the value for student_info.student_emergency_contact
     *
     * @mbggenerated
     */
    public void setStudentEmergencyContact(String studentEmergencyContact) {
        this.studentEmergencyContact = studentEmergencyContact == null ? null : studentEmergencyContact.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.student_contact_phone
     *
     * @return the value of student_info.student_contact_phone
     *
     * @mbggenerated
     */
    public String getStudentContactPhone() {
        return studentContactPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.student_contact_phone
     *
     * @param studentContactPhone the value for student_info.student_contact_phone
     *
     * @mbggenerated
     */
    public void setStudentContactPhone(String studentContactPhone) {
        this.studentContactPhone = studentContactPhone == null ? null : studentContactPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.student_email
     *
     * @return the value of student_info.student_email
     *
     * @mbggenerated
     */
    public String getStudentEmail() {
        return studentEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.student_email
     *
     * @param studentEmail the value for student_info.student_email
     *
     * @mbggenerated
     */
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail == null ? null : studentEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.student_remark
     *
     * @return the value of student_info.student_remark
     *
     * @mbggenerated
     */
    public String getStudentRemark() {
        return studentRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.student_remark
     *
     * @param studentRemark the value for student_info.student_remark
     *
     * @mbggenerated
     */
    public void setStudentRemark(String studentRemark) {
        this.studentRemark = studentRemark == null ? null : studentRemark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.student_photo
     *
     * @return the value of student_info.student_photo
     *
     * @mbggenerated
     */
    public String getStudentPhoto() {
        return studentPhoto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.student_photo
     *
     * @param studentPhoto the value for student_info.student_photo
     *
     * @mbggenerated
     */
    public void setStudentPhoto(String studentPhoto) {
        this.studentPhoto = studentPhoto == null ? null : studentPhoto.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", studentId=").append(studentId);
        sb.append(", studentName=").append(studentName);
        sb.append(", studentGender=").append(studentGender);
        sb.append(", studentBirthday=").append(studentBirthday);
        sb.append(", studentRacial=").append(studentRacial);
        sb.append(", studentNativePlace=").append(studentNativePlace);
        sb.append(", studentJoinTime=").append(studentJoinTime);
        sb.append(", studentMajor=").append(studentMajor);
        sb.append(", studentClass=").append(studentClass);
        sb.append(", studentPhone=").append(studentPhone);
        sb.append(", studentCellphone=").append(studentCellphone);
        sb.append(", studentAddress=").append(studentAddress);
        sb.append(", studentEmergencyContact=").append(studentEmergencyContact);
        sb.append(", studentContactPhone=").append(studentContactPhone);
        sb.append(", studentEmail=").append(studentEmail);
        sb.append(", studentRemark=").append(studentRemark);
        sb.append(", studentPhoto=").append(studentPhoto);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}