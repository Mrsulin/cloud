package club.sulin.springcloudwebconsumerribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jms.JmsProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Title: TestService
 */
public interface TestService {
    String sayHi();
}
