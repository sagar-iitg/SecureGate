package com.hclsw.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HomeController {

//
//    @GetMapping
//    public String testing() {
//
//        return "Welcome to HCL Software Hackathon";
//
//    }

   // @GetMapping("/index")
    public String welcome() {
        System.out.println("index");
        return "index";
    }

}


