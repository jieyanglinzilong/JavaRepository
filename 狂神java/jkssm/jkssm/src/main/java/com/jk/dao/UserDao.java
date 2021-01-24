package com.jk.dao;

import com.jk.domain.User;

public interface UserDao extends BaseDao<User>{

    User login(String name);
}
