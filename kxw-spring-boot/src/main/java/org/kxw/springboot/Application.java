package org.kxw.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Create by kangxiongwei on 2018/7/3 20:08.
 */
@SpringBootApplication(scanBasePackages = "org.kxw.springboot")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
