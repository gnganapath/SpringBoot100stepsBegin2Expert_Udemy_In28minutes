package com.fullstackdev.sb.udemy28min.begin2expert.springbootstarterweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class LoginController {

    @RequestMapping("/login")
    //@ResponseBody  -- to dispatch servet
    public String loginMessage(){
        return "login";
    }
}