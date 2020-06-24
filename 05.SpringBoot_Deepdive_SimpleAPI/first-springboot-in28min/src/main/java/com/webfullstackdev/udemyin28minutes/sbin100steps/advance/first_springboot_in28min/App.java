package com.webfullstackdev.udemyin28minutes.sbin100steps.advance.first_springboot_in28min;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ctx = SpringApplication.run(App.class, args);
    }
    @RequestMapping("/")
    public String Empty() {
    	return "Hello Maven  project with Spring Boot parent, starter web java build plugins";
    }
}
