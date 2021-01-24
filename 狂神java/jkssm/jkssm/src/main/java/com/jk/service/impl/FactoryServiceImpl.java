package com.jk.service.impl;

import com.jk.dao.FactoryDao;
import com.jk.domain.Factory;
import com.jk.pagination.Page;
import com.jk.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.UUID;

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

    @Override
    public void add(Factory factory) {
        //保存时先生成UUID
        factory.setFactoryId(UUID.randomUUID().toString());
        factoryDao.insert(factory);
    }

    @Override
    public void delete(String factoryId) {
        factoryDao.deleteById(factoryId);
    }

    @Override
    public void deleteIds(String[] ids) {
        factoryDao.delete(ids);
    }

    @Override
    public Factory findById(String factoryId) {
        return factoryDao.get(factoryId);
    }

    @Override
    public void save(Factory factory) {
        factoryDao.update(factory);
    }
}
