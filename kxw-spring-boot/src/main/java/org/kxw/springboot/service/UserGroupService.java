package org.kxw.springboot.service;

import org.kxw.springboot.dao.UserGroupDao;
import org.kxw.springboot.entity.UserGroup;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserGroupService {

    @Resource
    private UserGroupDao userGroupDao;

    public int insert(UserGroup pojo) {
        return userGroupDao.insert(pojo);
    }

    public int insertList(List<UserGroup> pojos) {
        return userGroupDao.insertList(pojos);
    }

    public List<UserGroup> select(UserGroup pojo) {
        return userGroupDao.select(pojo);
    }

    public int update(UserGroup pojo) {
        return userGroupDao.update(pojo);
    }

}
