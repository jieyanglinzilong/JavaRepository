package com.jk.service;

import com.jk.dao.FactoryDao;
import com.jk.domain.Factory;
import com.jk.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface FactoryService {

    public Page findPage(Page page);
    public List<Factory> find(Map map);

}
