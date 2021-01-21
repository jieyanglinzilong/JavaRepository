package com.jk.dao.impl;

import com.jk.dao.FactoryDao;
import com.jk.domain.Factory;
import org.springframework.stereotype.Repository;

/**
 *
 */
@Repository
public class FactoryDaoImpl extends BaseDaoImpl<Factory> implements FactoryDao {
    public FactoryDaoImpl() {
        //设置命名空间
        super.setNs("com.jk.dao.FactoryDao");
    }
    //类中写的方法，特殊的方法，
}
