package org.kxw.springboot.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.kxw.springboot.entity.RoleEntity;
import org.springframework.stereotype.Repository;

/**
 * Create by kangxiongwei on 2018/7/4 10:52.
 */
@Repository
public interface RoleDao {

    /**
     * 添加用户角色
     *
     * @param role
     */
    @Insert("insert into role (name, role) values (#{name}, #{role})")
    void saveRole(@Param("entity") RoleEntity role);

}
