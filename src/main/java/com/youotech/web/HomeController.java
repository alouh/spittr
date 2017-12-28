package com.youotech.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller         //声明为一个控制器
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)         //生命对"/"的GET请求
    public String home(){
        return "home";
    }
}
