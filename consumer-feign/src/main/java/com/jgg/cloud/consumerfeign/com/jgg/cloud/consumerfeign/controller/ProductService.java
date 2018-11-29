package com.jgg.cloud.consumerfeign.com.jgg.cloud.consumerfeign.controller;

import com.jgg.cloud.productserviceapi.ProductServiceApi;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "product-service", fallback = ProductServiceFallBack.class)
public interface ProductService extends ProductServiceApi {

}
