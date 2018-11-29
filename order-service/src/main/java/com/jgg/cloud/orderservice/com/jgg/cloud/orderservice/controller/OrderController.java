package com.jgg.cloud.orderservice.com.jgg.cloud.orderservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Value("${server.port}")
    String port;


    @RequestMapping("/OrderService")
    public String OrderService() {
        return " [OrderService ..... ]" + port;
    }


}
