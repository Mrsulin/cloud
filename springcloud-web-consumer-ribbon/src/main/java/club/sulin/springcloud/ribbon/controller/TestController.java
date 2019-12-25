package club.sulin.springcloud.ribbon.controller;

import club.sulin.springcloud.ribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: TestController
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("")
    public String getHi(){
        return testService.sayHi();
    }

}
