package org.kxw.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Create by kangxiongwei on 2018/7/3 20:08.
 */
@SpringBootApplication(scanBasePackages = "org.kxw.springboot")
@EnableTransactionManagement
@MapperScan("org.kxw.springboot.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
