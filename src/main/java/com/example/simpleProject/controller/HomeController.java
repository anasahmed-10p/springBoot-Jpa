package com.example.simpleProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home()
    {
        return ("<h1> hello</h1>");
    }

    @GetMapping("/user")
    public String user()
    {
        return ("<h1> Hello user</h1>");
    }

    @GetMapping("/admin")
    public String admin()
    {
        return ("<h1> hello admin </h1>");
    }
}
