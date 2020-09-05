package com.system.teach;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.system.teach.mapper")
@SpringBootApplication
public class TeachSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeachSystemApplication.class, args);
    }

}
