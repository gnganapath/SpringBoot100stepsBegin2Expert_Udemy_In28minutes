package com.fullstackdev.sb.udemy28min.begin2expert.springbootstarterweb.controller;

import com.fullstackdev.sb.udemy28min.begin2expert.springbootstarterweb.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
@SessionAttributes("name")
public class LoginController {

    //inject with instance
    //LoginService loginService = new LoginService();
    @Autowired
    LoginService loginService;
    //model


    //@RequestMapping("/login")//GET,POST,PUT
    @RequestMapping(value="/login", method = RequestMethod.GET)//GET,POST,PUT
    //@ResponseBody  -- to dispatch servet
    public String showLoginMessage( ModelMap model){
        //model.put("name", name);
        //System.out.println("name is "+name);
        return "login";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)//GET,POST,PUT
    //@ResponseBody  -- to dispatch servet
    public String showWelcomePage(@RequestParam String name, @RequestParam String password,ModelMap model){

        boolean isValidUser = loginService.validateUser(name, password);
        if(!isValidUser){
            model.put("errorMessage","Invalid credential");
            return "login";
        }
        model.put("name", name);
        model.put("password", password);
        System.out.println("name is "+name);
        return "welcome";
    }


}
