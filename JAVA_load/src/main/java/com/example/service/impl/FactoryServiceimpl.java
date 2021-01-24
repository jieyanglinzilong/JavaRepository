package com.example.service.impl;


import com.example.Page.Page;
import com.example.dao.Factorydao;
import com.example.domin.Factory;
import com.example.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service("FactoryService")
public class FactoryServiceimpl implements FactoryService {
    @Autowired
    Factorydao factorydao;


    @Override
    public List<Factory> findall() {

        List<Factory> factoryList=factorydao.findAllEntities();


        return factoryList;
    }

    @Override
    public Page findPage(Page page) {
        List<Factory> factoryList=factorydao.findPage();
        page.setResults(factoryList);

        return page;
    }

    @Override
    public void add(Factory factory) {
        //保存时先生成UUID
        factory.setFactoryId(UUID.randomUUID().toString());
        factorydao.insert(factory);


    }

    @Override
    public void delete(String factoryId) {
        factorydao.deleteById(factoryId);

    }

    @Override
    public void deleteIds(String[] ids) {
        factorydao.delete(ids);

    }

    @Override
    public Factory get(String id) {
        Factory factory =factorydao.get(id);
        return factory;
    }

    @Override
    public void save(Factory factory) {
        factorydao.update(factory);

    }

    @Override
    public Factory findById(String factoryId) {
        Factory factory=factorydao.get(factoryId);

        return factory;
    }


}
