package com.helloworld.MVCJSP.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    public HomeController() {
        super();
    }

    @GetMapping("")
    public String index(){
        return "index";
    }
}
