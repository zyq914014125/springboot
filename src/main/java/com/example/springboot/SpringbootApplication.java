package com.example.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 *@SpringBootApplication 是 Spring Boot 的核心注解，它是一个组合注解，该注解组合了：
 * @Configuration、@EnableAutoConfiguration、@ComponentScan；
 *若不是用 @SpringBootApplication 注解也可以使用这三个注解代替。
 *
 */
//Mapper扫描
@MapperScan("com.example.springboot.dao")
@SpringBootApplication
public class SpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
