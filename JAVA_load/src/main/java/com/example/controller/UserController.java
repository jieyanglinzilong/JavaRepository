package com.example.controller;

import com.example.domin.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value={"/home.action"})		//配合web下<url-pattern>/</url-pattern>
    public String login(){

        //return "/basicinfo/factory/jFactoryList.jsp";			//首页，删除根目录下index.jsp，否则上面url将被拦截进不来
        //return "/home/fmain.jsp";
        //return "redirect:sysadminMain.action";
        return  "/login.jsp";
    }
    @RequestMapping(value="/fmain.action")
    public String fmain(){
        return "/home/fmain.jsp";
    }

    @RequestMapping(value="/title.action")
    public String title(){
        return "/home/title.jsp";
    }

    @RequestMapping(value="/left.action")
    public String left(){
        return "/home/left.jsp";
    }

    @RequestMapping(value="/main.action")
    public String main(){
        return "/home/olmsgList.jsp";			//首页转向留言板
    }

    //系统管理模块

    @RequestMapping("/sysadminMain.action")
    public String sysadminMain(){
        return "/sysadmin/main.jsp";
    }

    @RequestMapping("/sysadminLeft.action")
    public String sysadminLeft(){
        return "/sysadmin/left.jsp";
    }

    @RequestMapping("/login.action")
    public String userLogin(String userName, String password){
        //1.管理员进入sysadmin
        //2.普通用户：/home/fmain.jsp
        //3.用户名密码出错：/index.jsp
        User user=userService.UserLogin(userName,password);

        if(user.getUserId().equals("-1")||user.getUserId().equals("-2")){
            return "/index.jsp";
        }else {
            if(user.getSuperUser().equals(1)){
                return "forward:/sysadminMain.action";
            }else {
                return "forward:/fmain.action";
            }
        }

    }
    //基础信息
    @RequestMapping("/baseinfoLeft.action")
    public String baseinfoLeft(){
        return "/baseinfo/left.jsp";
    }

    @RequestMapping("/baseinfoMain.action")
    public String baseinfoMain(){
        return "/baseinfo/main.jsp";
    }
    @GetMapping("/base.action")
    public String test(@RequestParam("paramName") String name){
       return  name;
    }



}
