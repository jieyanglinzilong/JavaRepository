package com.example.service;

import com.example.Page.Page;
import com.example.domin.Factory;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FactoryService {
    List<Factory> findall();
    Page findPage(Page page);
    public void add(Factory factory);
    void delete(String factoryId);
    void deleteIds(String[] ids);
    Factory get(String id);
    void save(Factory factory);
    public Factory findById(String factoryId);
}
