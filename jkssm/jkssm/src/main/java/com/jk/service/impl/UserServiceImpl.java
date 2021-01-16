package com.jk.service.impl;

import com.jk.dao.UserDao;
import com.jk.domain.User;
import com.jk.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User UserLogin(String name, String password) {
        String pwdMd5= DigestUtils.md5Hex(password);
        User user;
        user=userDao.login(name);
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
