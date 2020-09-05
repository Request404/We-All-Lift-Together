package com.system.teach.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class StudentInfo {
    private Integer studentId;
    private String studentName;
    private String studentGender;
    private String studentRacial;
    private String studentBirthday;
    private String studentJoinTime;
    private String studentMajor;
    private String studentClass;
    private String studentFirstParent;
    private String studentFirstParentWork;
    private String studentSecondParent;
    private String studentSecondParentWork;
    private String studentNativePlace;
    private String studentAddress;
    private Integer studentPhone;
    private Integer studentCellPhone;
    private String studentEmail;
    private String studentPhoto;

}
