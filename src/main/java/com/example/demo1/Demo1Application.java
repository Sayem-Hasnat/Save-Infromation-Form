package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//
//@ComponentScan(basePackages = {"com.example.demo1.init","com.example.demo1.controller"})
//@EntityScan(basePackages = {"com.example.demo1.entity"})
//@EnableJpaRepositories(basePackages = {"com.example.demo1.repository"})
@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

}
