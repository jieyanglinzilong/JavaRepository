package com.jk.dao.impl;

import com.jk.dao.UserDao;
import com.jk.domain.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

    public UserDaoImpl(){
        super.setNs("com.jk.dao.UserDao");
    }

    @Override
    public User login(String name) {
        //条件查询
        Map<String, String> map=new HashMap<String,String>();
        map.put("name",name);
        List<User> oList = this.getSqlSession().selectList(this.getNs() + ".login", map);
        if(oList.size()>0){
            return oList.get(0);
        }else {
            return null;
        }
    }
}
