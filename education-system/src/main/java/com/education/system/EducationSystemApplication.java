package com.education.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.education.system.mapper")
@SpringBootApplication
public class EducationSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(EducationSystemApplication.class, args);
    }

}
