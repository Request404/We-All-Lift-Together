package com.world.education.entity;

import java.io.Serializable;
import java.util.Date;

public class AdminAccount implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_account.admin_id
     *
     * @mbggenerated
     */
    private Integer adminId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_account.admin_password
     *
     * @mbggenerated
     */
    private String adminPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_account.admin_name
     *
     * @mbggenerated
     */
    private String adminName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_account.admin_add_time
     *
     * @mbggenerated
     */
    private Date adminAddTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_account.admin_email
     *
     * @mbggenerated
     */
    private String adminEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_account.admin_status
     *
     * @mbggenerated
     */
    private String adminStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table admin_account
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_account.admin_id
     *
     * @return the value of admin_account.admin_id
     *
     * @mbggenerated
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_account.admin_id
     *
     * @param adminId the value for admin_account.admin_id
     *
     * @mbggenerated
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_account.admin_password
     *
     * @return the value of admin_account.admin_password
     *
     * @mbggenerated
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_account.admin_password
     *
     * @param adminPassword the value for admin_account.admin_password
     *
     * @mbggenerated
     */
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_account.admin_name
     *
     * @return the value of admin_account.admin_name
     *
     * @mbggenerated
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_account.admin_name
     *
     * @param adminName the value for admin_account.admin_name
     *
     * @mbggenerated
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_account.admin_add_time
     *
     * @return the value of admin_account.admin_add_time
     *
     * @mbggenerated
     */
    public Date getAdminAddTime() {
        return adminAddTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_account.admin_add_time
     *
     * @param adminAddTime the value for admin_account.admin_add_time
     *
     * @mbggenerated
     */
    public void setAdminAddTime(Date adminAddTime) {
        this.adminAddTime = adminAddTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_account.admin_email
     *
     * @return the value of admin_account.admin_email
     *
     * @mbggenerated
     */
    public String getAdminEmail() {
        return adminEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_account.admin_email
     *
     * @param adminEmail the value for admin_account.admin_email
     *
     * @mbggenerated
     */
    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail == null ? null : adminEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_account.admin_status
     *
     * @return the value of admin_account.admin_status
     *
     * @mbggenerated
     */
    public String getAdminStatus() {
        return adminStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_account.admin_status
     *
     * @param adminStatus the value for admin_account.admin_status
     *
     * @mbggenerated
     */
    public void setAdminStatus(String adminStatus) {
        this.adminStatus = adminStatus == null ? null : adminStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_account
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adminId=").append(adminId);
        sb.append(", adminPassword=").append(adminPassword);
        sb.append(", adminName=").append(adminName);
        sb.append(", adminAddTime=").append(adminAddTime);
        sb.append(", adminEmail=").append(adminEmail);
        sb.append(", adminStatus=").append(adminStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}