package com.hyd.xixi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hfjldksjflsjdl");
        return "list";
    }
}
