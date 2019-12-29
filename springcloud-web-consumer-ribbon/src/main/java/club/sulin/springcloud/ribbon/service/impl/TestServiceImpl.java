package club.sulin.springcloud.ribbon.service.impl;

import club.sulin.springcloud.ribbon.service.TestService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Title: TestServiceImpl
 */
@Service("TestService")
public class TestServiceImpl implements TestService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "sayError")
    public String sayHi() {
        return restTemplate.getForObject("http://spring-cloud-service-provider-sulin-01", String.class);
    }

    public String sayError(){
        return String.format("Hi your message is :%s but request bad","666");
    }
}
