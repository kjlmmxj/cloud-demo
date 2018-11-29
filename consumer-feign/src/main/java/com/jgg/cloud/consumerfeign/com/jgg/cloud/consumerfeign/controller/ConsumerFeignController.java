package com.jgg.cloud.consumerfeign.com.jgg.cloud.consumerfeign.controller;

import com.jgg.cloud.productserviceapi.ProductServiceApi;
import com.jgg.cloud.productserviceapi.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "fegin")
public class ConsumerFeignController {

    private final Logger logger = Logger.getLogger(ConsumerFeignController.class);
    @Autowired
    ProductService productService;

    @RequestMapping(value = "/consumerProductFeign")
    @ResponseBody
    public String consumerProductFeign() {
        User user = new User(119999L, "小米", 11);
        logger.info("consumerProductFeign run .......");
        return productService.productServiceUser(user);
    }
}