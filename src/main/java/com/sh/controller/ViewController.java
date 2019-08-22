package com.sh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping("index")
    public String showView(){
        return "index";
    }
    @RequestMapping("loginview")
    public String showLogin(){
        return "login";
    }
    @RequestMapping("regview")
    public String showReg(){
        return "reg";
    }


}
