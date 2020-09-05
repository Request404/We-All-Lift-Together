package com.system.teach.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class TeacherInfo {
    private Integer teacherId;
    private String teacherName;
    private String teacherGender;
    private String teacherBirthday;
    private String teacherRacial;
    private String teacherGraduateSchool;
    private String teacherPost;
    private String teacherNativePlace;
    private String teacherAddress;
    private Integer teacherPhone;
    private Integer teacherCellPhone;
    private String teacherEmail;
    private String teacherPhoto;
}
