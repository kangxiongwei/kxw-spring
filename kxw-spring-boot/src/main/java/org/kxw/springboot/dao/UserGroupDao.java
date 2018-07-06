package org.kxw.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.kxw.springboot.entity.UserGroup;

import java.util.List;

public interface UserGroupDao {

    int insert(@Param("pojo") UserGroup pojo);

    int insertList(@Param("pojos") List<UserGroup> pojo);

    List<UserGroup> select(@Param("pojo") UserGroup pojo);

    int update(@Param("pojo") UserGroup pojo);

    int delete(@Param("pojo") UserGroup pojo);

}
