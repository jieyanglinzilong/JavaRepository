package com.example.service;

import com.example.domin.Factory;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface factoryservice {
    List<Factory> findall();
}
