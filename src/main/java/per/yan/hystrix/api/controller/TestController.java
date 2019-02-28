package per.yan.hystrix.api.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import per.yan.hystrix.api.api.TestApi;
import per.yan.hystrix.api.client.TestClient;

/**
 * @author gaoyan
 * @date 2019/1/24 14:33
 */
@DefaultProperties(defaultFallback = "defaultMethod", ignoreExceptions = NullPointerException.class)
@RestController
public class TestController implements TestApi {

    @Autowired
    private TestClient testClient;

    @HystrixCommand
    @PostMapping("/ddd")
    @Override
    public String test() {
//        throw new NullPointerException();
        return testClient.test();
    }

    private String defaultMethod() {
        return "熔断降级...";
    }
}
