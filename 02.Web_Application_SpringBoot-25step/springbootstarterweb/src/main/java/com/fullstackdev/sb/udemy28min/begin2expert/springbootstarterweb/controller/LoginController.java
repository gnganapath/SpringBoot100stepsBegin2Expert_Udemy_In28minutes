package com.fullstackdev.sb.udemy28min.begin2expert.springbootstarterweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class LoginController {


    //model


    @RequestMapping("/login")
    //@ResponseBody  -- to dispatch servet
    public String loginMessage(@RequestParam String name, ModelMap model){
        model.put("name", name);
        System.out.println("name is "+name);
        return "login";
    }


}
