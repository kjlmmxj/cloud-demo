package com.jgg.cloud.consumerfeign.com.jgg.cloud.consumerfeign.controller;

import com.jgg.cloud.productserviceapi.ProductServiceApi;
import com.jgg.cloud.productserviceapi.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/fallBack/api")
public class ProductServiceFallBack implements ProductService {

    private final Logger logger = Logger.getLogger(ProductServiceFallBack.class);

    @Override
    public String productService(@RequestParam(name = "user", required = false) String user) {
        logger.error();
        return "不好意，productService服务降级";
    }

    @Override
    public String productServiceUser(@RequestBody(required = false) User user) {
        return "不好意，productServiceUser服务降级";
    }
}
