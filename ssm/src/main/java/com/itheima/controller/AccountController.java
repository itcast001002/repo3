package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.service.AccuntServlce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/account")
public class AccountController {
    @Autowired
    private AccuntServlce accuntServlce;
    @RequestMapping(value = "/save",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String save(Account account){
        accuntServlce.save(account);
        return "保存成功";
    }
    @RequestMapping(value = "/findAll")
    @ResponseBody
    public ModelAndView findAll(){
        List<Account> all = accuntServlce.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("all",all);
        modelAndView.setViewName("accont");
        return modelAndView;
    }
}
