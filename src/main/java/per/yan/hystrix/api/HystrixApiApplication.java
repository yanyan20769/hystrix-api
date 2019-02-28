package per.yan.hystrix.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableHystrix
@SpringBootApplication
public class HystrixApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixApiApplication.class, args);
    }

}

