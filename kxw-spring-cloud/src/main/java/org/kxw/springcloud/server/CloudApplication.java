package org.kxw.springcloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Create by kangxiongwei on 2018/7/5 上午8:30
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudApplication.class, args);
    }


}
