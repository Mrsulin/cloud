package com.springcloud.demo.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Title: MainService
 */
@FeignClient(value = "spring-cloud-service-provider-sulin-01")
public interface MainService {

    @RequestMapping("/")
    public String sayHi();
}
