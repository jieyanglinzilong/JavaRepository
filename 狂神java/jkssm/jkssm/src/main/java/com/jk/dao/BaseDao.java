package com.jk.dao;

import com.jk.pagination.Page;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseDao<T> {

    //查
    List<T> findPage(Page page);
    //条件查询
    List<T> find(Map map);
    //根据主键查询单个
    T get(Serializable id);
    //增
    void insert(T entity);
    //删除
    void deleteById(Serializable id);
    //更改
    void update(T entity);
    //根据多个id，删除数据
    void delete(Serializable[] ids);

}
