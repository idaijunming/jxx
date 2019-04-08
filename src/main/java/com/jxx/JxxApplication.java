package com.jxx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.jxx.dao")
public class JxxApplication {

    public static void main(String[] args) {
        SpringApplication.run(JxxApplication.class, args);
    }

}