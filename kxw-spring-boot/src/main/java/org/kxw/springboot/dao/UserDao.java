package org.kxw.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.kxw.springboot.entity.UserEntity;

/**
 * Create by kangxiongwei on 2018/7/4 上午8:44
 */
public interface UserDao {

    //@Select("select * from user where name = #{name}")
    UserEntity getUser(String name);

    //@Insert("insert into user (name, password, icon) values (#{name}, #{password}, #{icon})")
    void saveUser(@Param("user") UserEntity user);
}
