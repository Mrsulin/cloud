package com.springcloud.demo.feign.service.hystrix;

import com.springcloud.demo.feign.service.MainService;
import org.springframework.stereotype.Component;

/**
 * Title: MainServiceHystrix
 */
@Component
public class MainServiceHystrix implements MainService {
    @Override
    public String sayHi() {
        return String .format("Hi your message is --feign hystrix :%s","feign service 实现类熔断机制");
    }
}
