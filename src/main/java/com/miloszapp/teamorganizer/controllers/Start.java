package com.miloszapp.teamorganizer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Start {

    @RequestMapping(value = "/home")
    public String welcomeScreen(){
        return "/start/welcomeView";
    }

    @RequestMapping(value = "/")
    @ResponseBody
    public String test2(){
        return "test test test";
    }

}
