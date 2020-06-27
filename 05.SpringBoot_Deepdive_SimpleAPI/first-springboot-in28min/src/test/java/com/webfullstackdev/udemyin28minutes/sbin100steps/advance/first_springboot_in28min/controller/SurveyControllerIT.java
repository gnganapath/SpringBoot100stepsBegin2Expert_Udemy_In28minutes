package com.webfullstackdev.udemyin28minutes.sbin100steps.advance.first_springboot_in28min.controller;

import com.webfullstackdev.udemyin28minutes.sbin100steps.advance.first_springboot_in28min.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SurveyControllerIT {

    @LocalServerPort
    public int port;

    @Test
    public void test(){
        //fail("Not yet implemented");
        System.out.println("PORT = "+ port);
    }

}