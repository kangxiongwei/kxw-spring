package org.kxw.springboot.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kxw.springboot.entity.UserEntity;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Create by kangxiongwei on 2018/7/4 10:14.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserDaoTest {

    @Resource
    private UserDao userDao;

   /* @Test
    public void testSaveUser() {
        UserEntity user = new UserEntity();
        user.setName("zhangsan");
        user.setPassword("xxxxxx");
        user.setIcon("sdffdsfdsdffdfd");
        userDao.saveUser(user);
    }*/

    @Test
    public void testGetUser() {
        UserEntity user = this.userDao.getUser("zhangsan");
        System.out.println(user);
    }
}
