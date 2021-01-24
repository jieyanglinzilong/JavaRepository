package com.example.controller.basicinfo;


import com.example.Page.Page;
import com.example.domin.Factory;
import com.example.service.FactoryService;
import org.jfree.util.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @RequestMapping("/deleteIds.action")
    public String deleteIds(String[] ids, Model model){
        if(ids==null||ids.length==0){
            model.addAttribute("error","删除的ID不能为空");
        }else {
            System.out.println(ids[0]);
            factoryService.deleteIds(ids);
            model.addAttribute("success",true);
        }
        return "redirect:/basicinfo/factory/list.action";
    }
    @RequestMapping("/insert.action")
    public String insert(Factory factory, Model model){
        if(factory==null){
            model.addAttribute("error","保存数据不能为空");
            return "/basicinfo/factory/jFactoryCreate.jsp";
        }
        System.out.println("获取数据"+factory.getFax());
        factoryService.add(factory);
        return "redirect:/basicinfo/factory/list.action";
    }
    //转向修改页面
    @RequestMapping("/toupdate.action")
    public String toupdate(String id, Model model){
        Factory obj = factoryService.get(id);
        model.addAttribute("obj", obj);

        return "/basicinfo/factory/jFactoryUpdate.jsp";
    }
    @RequestMapping("/toModify.action")
    ///basicinfo/factory/toModify.action
    public String toModify(String factoryId, Model model){
        if(factoryId==null||"".equals(factoryId)){
            model.addAttribute("error","修改的ID不能为空");
            return "redirect:/basicinfo/factory/list.action";
        }else {
            Factory factory=factoryService.findById(factoryId);
            model.addAttribute("factory", factory);
            return "/basicinfo/factory/jFactoryModify.jsp";
        }
    }



    @RequestMapping("/save.action")
    public String save(Factory factory, Model model){
        if(factory==null||factory.getFactoryId()==null||"".equals(factory.getFactoryId())){
            model.addAttribute("error","保存数据不能为空");
            return "/basicinfo/factory/jFactoryModify.jsp";
        }else {
            factoryService.save(factory);
            return "redirect:/basicinfo/factory/list.action";
        }



}


}

