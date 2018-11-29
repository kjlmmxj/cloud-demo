package com.jgg.cloud.productservice.com.jgg.cloud.productservice.controller;

import com.jgg.cloud.productserviceapi.ProductServiceApi;
import com.jgg.cloud.productserviceapi.User;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductServiceImpl implements ProductServiceApi {

    private final Logger logger = Logger.getLogger(ProductServiceImpl.class);

    @RequestMapping(value = "/")
    public String rootPath() {
        return "rootPath";
    }

    @Override
    public String productService(@RequestParam(name = "user", required = false) String user) {
        return "productService ------" + user;
    }

    @Override
    public String productServiceUser(@RequestBody(required = false) User user) {
        logger.info("productservice xxx productServiceUser ....");
        int i = 1/0;
        return user.toString();
    }
}
