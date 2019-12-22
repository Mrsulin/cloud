package club.sulin.springcloudwebconsumerribbon.service.impl;

import club.sulin.springcloudwebconsumerribbon.service.TestService;
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
    public String sayHi() {
        return restTemplate.getForObject("http://spring-cloud-service-provider-sulin-01", String.class);
    }

}
