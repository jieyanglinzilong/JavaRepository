package com.example.test;


import com.example.domin.Factory;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:springmvc.xml")
public class test2 {
    @Autowired
    com.example.service.factoryservice factoryservice;
    @Test
    public void find(){

        List<Factory> factories=factoryservice.findall();
        for (Factory factorieslist: factories
        ) {
            System.out.println(factorieslist);

        }
    }
}
