package test;

import com.example.Page.Page;
import com.example.domin.Factory;
import com.example.service.FactoryService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test1 {
    @Test
    public void find(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:application.xml");
        FactoryService factoryService=(FactoryService)ac.getBean("FactoryService");
        List<Factory> factoryList=factoryService.findall();
        for (Factory fa:factoryList
             ) {
            System.out.println(fa);

        }

    }


    @Test
    public void batch(){
        Integer page=1;
        PageHelper.startPage(page,3);
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:application.xml");
        FactoryService factoryService=(FactoryService)ac.getBean("FactoryService");
        List<Factory> factoryList=factoryService.findall();
        PageInfo pageInfo=new PageInfo(factoryList);

    }
    @Test
    public void findPage(){
        Page<Factory> page=new Page<Factory>();
        page.setPageNo(1);
        page.setPageSize(10);
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:application.xml");
        FactoryService factoryService=(FactoryService)ac.getBean("FactoryService");
        page=factoryService.findPage(page);
        for (Factory factory:page.getResults()) {
            System.out.println(factory.getFactoryId());
        }

    }


}
