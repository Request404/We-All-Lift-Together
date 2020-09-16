package com.world.education;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(value = "com.world.education.dao")
public class EducationSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(EducationSystemApplication.class, args);
    }

}
