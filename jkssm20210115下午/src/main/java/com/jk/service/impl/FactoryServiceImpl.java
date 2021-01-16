package com.jk.service.impl;

import com.jk.dao.FactoryDao;
import com.jk.domain.Factory;
import com.jk.pagination.Page;
import com.jk.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FactoryServiceImpl implements FactoryService {

    @Autowired
    FactoryDao factoryDao;

    @Override
    public Page findPage(Page page) {
        List<Factory> olist=factoryDao.findPage(page);
        page.setResults(olist);
        return page;
    }

    @Override
    public List<Factory> find(Map map) {
        return factoryDao.find(map);
    }
}
