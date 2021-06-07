package com.itheima.controller;

import com.itheima.account.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;


@Controller
public class Controller01 {
    @RequestMapping("/requestParam")
    public String requestParam(@RequestParam(name = "username",required = true,defaultValue = "花花") String username){
        System.out.println(username+"happening");
        return "/success.jsp"   ;
    }

    @RequestMapping("/requestBody")
    public String requestBody(@RequestBody Account string) throws UnsupportedEncodingException {
        /*System.out.println(string);

        String newString= URLDecoder.decode(string,"utf-8");*/

        System.out.println(string);

        return "/success.jsp";
    }
    @RequestMapping("/delete/{id}")
    public String pathVariable(@PathVariable("id") Integer a){
        System.out.println("要删除的元素id为："+a);
        return "/success.jsp";
    }
    @RequestMapping("/requestHeader")
    public String requestHeader(@RequestHeader("User-agent") String userAgent){
        System.out.println(userAgent);
        return "success.jsp";
    }
}
