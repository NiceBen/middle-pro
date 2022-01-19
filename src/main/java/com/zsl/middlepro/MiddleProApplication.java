package com.zsl.middlepro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.zsl")
@SpringBootApplication
public class MiddleProApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MiddleProApplication.class, args);
        // 获取 redisTemplate 并打印输出
//        Object redisTemplate = context.getBean("redisTemplate");
        Object redisTest = context.getBean("redisTest");
        System.out.println(redisTest);
    }

}
