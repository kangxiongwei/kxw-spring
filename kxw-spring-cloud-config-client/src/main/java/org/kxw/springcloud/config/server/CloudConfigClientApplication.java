package org.kxw.springcloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Create by kangxiongwei on 2018/7/5 14:20.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigClientApplication.class, args);
    }

}
