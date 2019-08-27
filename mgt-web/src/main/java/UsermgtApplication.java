package com.usermgt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan
@EnableCaching
@EnableScheduling
public class UsermgtApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsermgtApplication.class, args);
    }

}
