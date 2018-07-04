package org.kxw.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.kxw.springboot.entity.RoleEntity;

/**
 * Create by kangxiongwei on 2018/7/4 10:52.
 */
public interface RoleDao {

    /**
     * 添加用户角色
     *
     * @param role
     */
    //@Insert("insert into role (name, role) values (#{name}, #{role})")
    int save(@Param("entity") RoleEntity role);

}
