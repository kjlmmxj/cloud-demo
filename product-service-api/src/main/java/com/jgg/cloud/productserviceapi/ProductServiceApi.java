package com.jgg.cloud.productserviceapi;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
public interface ProductServiceApi {
    @RequestMapping(value = "/productService")
    public String productService(@RequestParam(name = "user", required = false) String user);

    @RequestMapping(value = "/productServiceUser")
    public String productServiceUser(@RequestBody(required = false) User user);
}
