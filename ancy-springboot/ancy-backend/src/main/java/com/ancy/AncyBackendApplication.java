package com.ancy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ancy.mapper")
public class AncyBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(AncyBackendApplication.class, args);
    }

}
