package com.hms.controller;

import com.hms.entity.Login;
import com.hms.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.management.MBeanAttributeInfo;


@Controller
@RequestMapping("/user1")
public class UserController {
    @Autowired
    private LoginService loginService;
    @RequestMapping("/login")
    public ModelAndView login(Login login) throws Exception {
        ModelAndView mv = new ModelAndView();
        System.out.println(login.getName()+"/"+login.getPassword());
        Login l = loginService.Login(login.getName(), login.getPassword());
        if (l==null){
            mv.addObject("mgs","账号密码错误");
            mv.setViewName("index.html");
        }else{
            mv.setViewName("/admin/index.html");
        }
        return mv;
    }
}
