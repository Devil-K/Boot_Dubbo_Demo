package com.dubboTest.demo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by IntelliJ IDEA.
 *
 * @Auther: jkMa
 * @Date: 2020/3/31 22:21
 * @ItemName: dubboDemo
 */
@EnableDubbo
@SpringBootApplication
public class UserServiceProvider {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceProvider.class,args);
    }
}
