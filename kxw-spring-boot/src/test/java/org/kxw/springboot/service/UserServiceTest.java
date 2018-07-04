package org.kxw.springboot.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kxw.springboot.entity.UserEntity;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Create by kangxiongwei on 2018/7/4 16:25.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testSaveUser() {
        UserEntity user = new UserEntity();
        user.setName("lisi");
        user.setPassword("xxxxxx");
        user.setIcon("sdffdsfdsdffdfd");
        this.userService.saveUser(user);
    }
}
