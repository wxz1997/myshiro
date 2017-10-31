package cn.wxz1997.dao;

import cn.wxz1997.entity.User;

import java.util.Set;

public interface UserDao {
    Integer createUser(User user);
    void deleteUser(Long userId);

    User findOne(Long userId);

    User findByUsername(String username);

    Set<String> findRoles(String username);

    Set<String> findResources(String username);

}
