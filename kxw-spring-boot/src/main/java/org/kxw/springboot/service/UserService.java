package org.kxw.springboot.service;

import org.kxw.springboot.dao.UserDao;
import org.kxw.springboot.entity.UserEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Create by kangxiongwei on 2018/7/4 10:43.
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;

    /**
     * 添加用户
     *
     * @param user
     */
    @Transactional
    public void saveUser(UserEntity user) {
        this.userDao.saveUser(user);
    }


}
