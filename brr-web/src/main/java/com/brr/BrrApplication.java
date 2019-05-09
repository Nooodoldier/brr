package com.brr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author:me
 */
@EnableSwagger2
@SpringBootApplication
@EnableTransactionManagement
public class BrrApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrrApplication.class, args);
        System.out.println("brr启动成功--------------OK！");
    }

}
