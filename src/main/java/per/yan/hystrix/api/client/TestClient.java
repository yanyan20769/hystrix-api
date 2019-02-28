package per.yan.hystrix.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import per.yan.hystrix.sdk.api.TestApi;

/**
 * @author gaoyan
 * @date 2019/1/24 14:30
 */
@FeignClient(name = "test", url = "http://localhost:8090")
public interface TestClient extends TestApi {

}
