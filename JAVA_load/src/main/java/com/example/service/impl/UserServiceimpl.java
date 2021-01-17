package com.example.service.impl;

import com.example.dao.Userdao;
import com.example.domin.User;
import com.example.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceimpl implements UserService {
     @Autowired
     Userdao userdao;

    @Override
    public User UserLogin(String name, String password) {
        String pwdMd5= DigestUtils.md5Hex(password);
        User user;
        user=userdao.login(name);
        if(user!=null){
            if(!user.getPassword().equals(pwdMd5)){
                user=new User();
                user.setUserId("-2");
                user.setName("密码不正确");
            }
        }else {
            user=new User();
            user.setUserId("-1");
            user.setName("查无此人");
        }
        return user;
    }
}
