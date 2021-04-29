package com.example.gittest.controller.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {

    @RequestMapping("/hello")
    String sayHello(){
        return  "<h1> Hello </h1>";
    }
}
