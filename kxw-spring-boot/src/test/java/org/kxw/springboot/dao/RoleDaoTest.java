package org.kxw.springboot.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kxw.springboot.entity.RoleEntity;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Create by kangxiongwei on 2018/7/4 11:00.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RoleDaoTest {

    @Resource
    private RoleDao roleDao;

    @Test
    public void testSaveRole() {
        RoleEntity role = new RoleEntity();
        role.setName("管理员");
        role.setRole("admin");
        this.roleDao.saveRole(role);
        System.out.println(role);
    }
}
