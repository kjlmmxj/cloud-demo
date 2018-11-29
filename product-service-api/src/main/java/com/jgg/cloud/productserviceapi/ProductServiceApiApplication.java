package com.jgg.cloud.productserviceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
//@EnableFeignClients
public class ProductServiceApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApiApplication.class, args);
    }
}
