package com.example.service.impl;

import com.example.dao.Userdao;
import com.example.domin.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceimpl implements UserService {
     @Autowired
     Userdao userdao;

    @Override
    public User UserLogin(String name, String password) {
        return null;
    }
}
