package com.system.teach.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@NoArgsConstructor
@Accessors(chain = true)
public class TeacherAccount {
    private Integer teacherId;
    private String teacherPassword;
    private String teacherEmail;
    private Enum<Account_State> accountState;

}
