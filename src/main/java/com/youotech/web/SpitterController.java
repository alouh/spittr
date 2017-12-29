package com.youotech.web;

import com.youotech.bean.SpitterBean;
import com.youotech.data.SpitterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("spitter")
public class SpitterController {

    @Autowired
    private SpitterRepository spitterRepository;

    //处理对"/spitter/register"的GET请求
    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String showRegistrationForm(){
        return "registerForm";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String processRegistration(
            @Valid SpitterBean spitterBean, Errors errors){

        if (errors.hasErrors()){
            return "registerForm";
        }
        spitterRepository.save(spitterBean);//保存SpitterBean

        return "redirect:/spitter/" + //重定向到基本信息页
                spitterBean.getUserName();
    }

    @RequestMapping(value = "/{userName}",method = RequestMethod.GET)
    public String showSpitterProfile(
            @PathVariable String userName,Model model){

        SpitterBean spitterBean = spitterRepository.findByUserName(userName);
        model.addAttribute(spitterBean);

        return "profile";
    }

}
