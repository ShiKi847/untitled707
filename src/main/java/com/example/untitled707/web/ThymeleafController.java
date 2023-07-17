package com.example.untitled707.web;

import com.example.untitled707.entity.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ThymeleafController {
    @RequestMapping("/1")
    public String t(Model model){
        model.addAttribute("tip","动态数据页面");
        return "1";
    }
    @RequestMapping("/hi")
    @ResponseBody
    public String m(){
        return "hi";
    }
    @RequestMapping("/2")
    public String t2(Model model){
        model.addAttribute("tip","动态数据页面");
        return "2";
    }
    @RequestMapping("/index")
    public String index(Model model){
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model,HttpSession session) {
        if ("admin".equals(username) && "123".equals(password)) {
            session.setAttribute("username", username);
            return "redirect:/index";
        } else {
            model.addAttribute("error", "用户名或密码错误");
            return "login";
        }
    }
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("username");
        return "index";
    }
    @GetMapping("/xxx")
    public String xxx() {
        System.out.println(1/0);
        return "redirect:/";
    }
}
