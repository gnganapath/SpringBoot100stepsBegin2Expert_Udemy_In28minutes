package com.fullstackdev.sb.udemy28min.begin2expert.springbootstarterweb.Service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
    public boolean validateUser( String userid, String password){
        return userid.equalsIgnoreCase("in28minutes") && password.equalsIgnoreCase("dummy");
    }
}
