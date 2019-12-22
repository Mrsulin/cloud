package club.sulin.springcloudwebconsumerribbon.controller;

import club.sulin.springcloudwebconsumerribbon.service.TestService;
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

    @GetMapping("/hi")
    public String getHi(){
        return testService.sayHi();
    }

}
