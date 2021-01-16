package service;

import com.jk.domain.Factory;
import com.jk.pagination.Page;
import com.jk.service.FactoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans.xml")
public class FactoryServiceTest {

    @Autowired
    private FactoryService factoryService;

    @Test
    public void findPage(){
        Page<Factory> page=new Page<Factory>();
        page.setPageNo(1);
        page.setPageSize(10);
        page=factoryService.findPage(page);
        for (Factory factory:page.getResults()) {
            System.out.println(factory.getFactoryId());
        }
    }

    @Test
    public void find(){
        List<Factory> olist=factoryService.find(null);
        for (Factory factory:olist) {
            System.out.println(factory.getFactoryId());
        }
    }
}
