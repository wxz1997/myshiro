package cn.wxz1997.service.impl;

import cn.wxz1997.dao.UserDao;
import cn.wxz1997.entity.User;
import cn.wxz1997.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public Integer createUser(User user) {
        return userDao.createUser(user);
    }


    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public Set<String> findRoles(String username) {
        return userDao.findRoles(username);
    }

    @Override
    public Set<String> findResources(String username) {
        return userDao.findResources(username);
    }

}
