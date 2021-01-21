package com.example.controller.basicinfo;


import com.example.Page.Page;
import com.example.domin.Factory;
import com.example.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/basicinfo/factory")
public class FactoryController {

    @Autowired
    private FactoryService factoryService;

    //http://localhost:8080/jkssm/basicinfo/factory/list.action
    @RequestMapping("/list.action")
    public String list(Page page, Model model){
        if( page==null && page.getPageNo()<=0 && page.getPageSize()<=0) {
            page = new Page();
            page.setPageNo(1);
            page.setPageSize(10);
        }
        page=factoryService.findPage(page);
        model.addAttribute("page",page);
        return "/basicinfo/factory/jFactoryList.jsp";
    }
    @RequestMapping("/tocreate.action")
    public String tocreate(){
        return "/basicinfo/factory/jFactoryCreate.jsp";
    }
    @RequestMapping("/delete.action")
    public String delete(String factoryId, Model model){
        if(factoryId==null){
            model.addAttribute("error","删除的ID不能为空");

        }else {
            factoryService.delete(factoryId);
        }
        return "redirect:/basicinfo/factory/list.action";
    }
/**
    @RequestMapping("/insert.action")
    public String insert(Factory factory, Model model){
        if(factory==null){
            model.addAttribute("error","保存数据不能为空");
            return "/basicinfo/factory/jFactoryCreate.jsp";
        }
        factoryService.add(factory);
        return "redirect:/basicinfo/factory/list.action";
    }


    @RequestMapping("/deleteIds.action")
    public String deleteIds(String[] ids, Model model){
        if(ids==null||ids.length==0){
            model.addAttribute("error","删除的ID不能为空");
        }else {
            factoryService.deleteIds(ids);
            model.addAttribute("success",true);
        }
        return "redirect:/basicinfo/factory/list.action";
    }**/
}

