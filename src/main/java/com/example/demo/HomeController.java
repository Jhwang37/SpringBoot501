package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/contactus")
    public String contact(){
        return "contact";
    }
    @RequestMapping("/aboutus")
    public String aboutUs(){
        return "about";
    }
}
