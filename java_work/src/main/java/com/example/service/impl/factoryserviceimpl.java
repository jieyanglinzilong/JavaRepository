package com.example.service.impl;

import com.example.dao.Factorydao;
import com.example.domin.Factory;
import com.example.service.factoryservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class factoryserviceimpl implements factoryservice {
    @Autowired
    Factorydao factorydao;
    @Override
    public List<Factory> findall() {
        List<Factory> factoryList=factorydao.findAll();

        return factoryList;
    }
}
