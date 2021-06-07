package com.itheima.controller;

import com.itheima.account.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Controller02 {
    /*@ResponseBody*/
    @PostMapping("/account")
    public String addAccount(Account account){
        System.out.println("add方法执行"+account);
        return "/success.jsp";
    }
    @ResponseBody
    @PutMapping("/account")
    public String updateAccount(Account account){
        System.out.println("update方法修改"+account);
        return "/success.jsp";
    }

    @GetMapping("/account/{id}")
    public String queryAccount(@PathVariable("id") int id){
        System.out.println("查询的id为"+id);
        return "/success.jsp";
    }

    @DeleteMapping("/account/{id}")
    public String deleteAccount(@PathVariable("id") int id){
        System.out.println("删除的用户id为"+id);
        return "/success.jsp";
    }
}
