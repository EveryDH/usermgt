package com.usermgt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.usermgt.infrastructure.mapper" )
@SpringBootApplication
public class UsermgtApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsermgtApplication.class, args);
    }
}
