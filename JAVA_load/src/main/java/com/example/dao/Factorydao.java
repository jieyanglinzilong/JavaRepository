package com.example.dao;

import com.example.domin.Factory;

import java.io.Serializable;
import java.util.List;

public interface Factorydao {
    List<Factory> findAllEntities();
    List<Factory> findPage();
    void deleteById(String id);
    //根据多个id，删除数据
    void delete(Serializable[] ids);
    void insert(Factory factory);
    Factory get(String id);
    void update(Factory factory);
}
