package com.springboot.security.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {
    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage()
    {
        //return "plain-login";
        return "fancy-login";
    }

    @GetMapping("/access-denied")
    public String showDenied()
    {
        return "access-denied";
    }
}
