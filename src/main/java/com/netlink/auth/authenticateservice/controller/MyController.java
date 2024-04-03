package com.netlink.auth.authenticateservice.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/hello")
    public String greet(HttpServletRequest httpServletRequest)
    {
        return "Hello World!  "+httpServletRequest.getSession().getId();
    }
    @GetMapping("/about")
    public String about(HttpServletRequest httpServletRequest)
    {
        return "Adil Qureshi  "+httpServletRequest.getSession().getId();
    }
}
