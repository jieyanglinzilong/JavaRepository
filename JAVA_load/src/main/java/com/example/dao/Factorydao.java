package com.example.dao;

import com.example.domin.Factory;

import java.util.List;

public interface Factorydao {
    List<Factory> findAllEntities();
    List<Factory> findPage();
}
