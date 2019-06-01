package com.mypack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptProvier8003_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvier8003_App.class,args);
    }
}
