package com.example.service;

import com.example.domin.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService {
    User UserLogin(String name, String password);
}
