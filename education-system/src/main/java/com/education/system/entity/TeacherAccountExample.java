package com.education.system.entity;

import java.util.ArrayList;
import java.util.List;

public class TeacherAccountExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table teacher_account
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table teacher_account
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table teacher_account
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_account
     *
     * @mbggenerated
     */
    public TeacherAccountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_account
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_account
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_account
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_account
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_account
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_account
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_account
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_account
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_account
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_account
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table teacher_account
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordIsNull() {
            addCriterion("teacher_password is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordIsNotNull() {
            addCriterion("teacher_password is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordEqualTo(String value) {
            addCriterion("teacher_password =", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordNotEqualTo(String value) {
            addCriterion("teacher_password <>", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordGreaterThan(String value) {
            addCriterion("teacher_password >", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_password >=", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordLessThan(String value) {
            addCriterion("teacher_password <", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordLessThanOrEqualTo(String value) {
            addCriterion("teacher_password <=", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordLike(String value) {
            addCriterion("teacher_password like", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordNotLike(String value) {
            addCriterion("teacher_password not like", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordIn(List<String> values) {
            addCriterion("teacher_password in", values, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordNotIn(List<String> values) {
            addCriterion("teacher_password not in", values, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordBetween(String value1, String value2) {
            addCriterion("teacher_password between", value1, value2, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordNotBetween(String value1, String value2) {
            addCriterion("teacher_password not between", value1, value2, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailIsNull() {
            addCriterion("teacher_email is null");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailIsNotNull() {
            addCriterion("teacher_email is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailEqualTo(String value) {
            addCriterion("teacher_email =", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailNotEqualTo(String value) {
            addCriterion("teacher_email <>", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailGreaterThan(String value) {
            addCriterion("teacher_email >", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_email >=", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailLessThan(String value) {
            addCriterion("teacher_email <", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailLessThanOrEqualTo(String value) {
            addCriterion("teacher_email <=", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailLike(String value) {
            addCriterion("teacher_email like", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailNotLike(String value) {
            addCriterion("teacher_email not like", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailIn(List<String> values) {
            addCriterion("teacher_email in", values, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailNotIn(List<String> values) {
            addCriterion("teacher_email not in", values, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailBetween(String value1, String value2) {
            addCriterion("teacher_email between", value1, value2, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailNotBetween(String value1, String value2) {
            addCriterion("teacher_email not between", value1, value2, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusIsNull() {
            addCriterion("teacher_status is null");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusIsNotNull() {
            addCriterion("teacher_status is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusEqualTo(Integer value) {
            addCriterion("teacher_status =", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusNotEqualTo(Integer value) {
            addCriterion("teacher_status <>", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusGreaterThan(Integer value) {
            addCriterion("teacher_status >", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_status >=", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusLessThan(Integer value) {
            addCriterion("teacher_status <", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_status <=", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusIn(List<Integer> values) {
            addCriterion("teacher_status in", values, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusNotIn(List<Integer> values) {
            addCriterion("teacher_status not in", values, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusBetween(Integer value1, Integer value2) {
            addCriterion("teacher_status between", value1, value2, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_status not between", value1, value2, "teacherStatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table teacher_account
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table teacher_account
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}