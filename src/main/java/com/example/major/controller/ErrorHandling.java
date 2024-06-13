package com.example.major.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorHandling implements ErrorController {

    @GetMapping("/error")
    public String error(){
        return "404";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
