package com.example.service.impl;


import com.example.Page.Page;
import com.example.dao.Factorydao;
import com.example.domin.Factory;
import com.example.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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


}
