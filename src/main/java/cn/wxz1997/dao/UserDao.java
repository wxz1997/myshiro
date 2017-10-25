package cn.wxz1997.dao;

import cn.wxz1997.entity.User;

public interface UserDao {
    User selectByUsername(String username);
}
