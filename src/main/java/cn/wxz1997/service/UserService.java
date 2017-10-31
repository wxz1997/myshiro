package cn.wxz1997.service;

import cn.wxz1997.entity.User;

import java.util.Set;

public interface UserService {
    /**
     * 创建用户
     * @param user
     */
    public Integer createUser(User user);


    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    public User findByUsername(String username);

    /**
     * 根据用户名查找其角色
     * @param username
     * @return
     */
    public Set<String> findRoles(String username);

    /**
     * 根据用户名查找其资源
     * @param username
     * @return
     */
    public Set<String> findResources(String username);

}
