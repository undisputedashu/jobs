package com.example.jobs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return "Hello jobs!";
    }

    @GetMapping("/home")
    public String secure() {
        return "Hello home!";
    }
}
