package club.sulin.hellospringcloudserviceprovidersulin02.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: MainController
 */
@RestController("/main")
public class MainController {
    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String name;

    @GetMapping("/aa")
    public String aa(){
        return "aa-hello";
    }
    @GetMapping("/")
    public String defaultRequest(){
        return String.format("调用的服务提供者是：%S，端口为：%s",name,port);
    }

}
