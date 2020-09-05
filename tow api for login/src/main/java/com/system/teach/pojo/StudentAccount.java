package com.system.teach.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@NoArgsConstructor
@Accessors(chain = true)
public class StudentAccount {
    private Integer studentId;
    private String studentPassword;
    private String studentEmail;
    private Enum<Account_State> accountState;
}
