package com.youotech.web;

import com.youotech.bean.SpittleBean;
import com.youotech.data.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/spittles")
public class SpittleController {

    @Autowired
    private SpittleRepository spittleRepository;

    private final String MAX_LONG_AS_STRING = Long.MAX_VALUE + "";

    /*@RequestMapping(method = RequestMethod.GET)
    public String spittles(Model model){
        //将spittle添加到模型中
        model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE,20));

        //返回视图名
        return "spittles";
    }*/

    @RequestMapping(method = RequestMethod.GET)
    public List<SpittleBean> spittles(
            @RequestParam(value = "max",defaultValue = MAX_LONG_AS_STRING)long max,
            @RequestParam(value = "count",defaultValue = "20")int count){
        return spittleRepository.findSpittles(max,count);
    }

    @RequestMapping(value = "/{spittleId}",method = RequestMethod.GET)
    public String spittle(
            @PathVariable("spittleId") long spittleId,
            Model model) {
        model.addAttribute(spittleRepository.findOne(spittleId));

        return "spittle";
    }
}
