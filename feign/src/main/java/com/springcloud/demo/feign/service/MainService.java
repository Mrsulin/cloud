package com.springcloud.demo.feign.service;

import com.springcloud.demo.feign.service.hystrix.MainServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Title: MainService
 */
@FeignClient(value = "spring-cloud-service-provider-sulin-01",fallback = MainServiceHystrix.class)
public interface MainService {

    @RequestMapping("/")
    public String sayHi();
}
