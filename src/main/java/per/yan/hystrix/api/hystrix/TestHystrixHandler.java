package per.yan.hystrix.api.hystrix;

import org.springframework.stereotype.Component;
import per.yan.hystrix.api.client.TestClient;

/**
 * @author gaoyan
 * @date 2019/1/24 14:35
 */
//@Component
public class TestHystrixHandler implements TestClient {

    @Override
    public String test() {
        return "服务降级...";
    }
}
