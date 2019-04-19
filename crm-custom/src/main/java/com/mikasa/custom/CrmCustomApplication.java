package com.mikasa.custom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * @author tianluhua
 */
@SpringBootApplication
@Configuration
@MapperScan(basePackages="com.mikasa.custom.dao")
public class CrmCustomApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmCustomApplication.class, args);
    }

}
