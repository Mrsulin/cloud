package com.springcloud.demo.feign.controller;

import com.springcloud.demo.feign.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: MainController
 */
@RestController
public class MainController {
    @Autowired
    private MainService mainService;

    @GetMapping("")
    public String getHi(){
        return mainService.sayHi();
    }

}

