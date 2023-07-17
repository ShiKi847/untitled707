package com.example.untitled707.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HiController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "欢迎使用springboots,你好世界";
    }
}
