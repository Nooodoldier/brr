package com.brr.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 聚合项目入口
 */
@SpringBootApplication
public class BrrWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrrWebApplication.class, args);
        System.out.println("brr启动成功--------------OK！");
    }

}
