package com.example.untitled707.web;

import com.example.untitled707.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class NameController {
    @RequestMapping("/user")
    @ResponseBody
    public User user() {
        User user = new User();
        user.setName("嘎子");
        user.setAge(25);
        return user;
    }

}
