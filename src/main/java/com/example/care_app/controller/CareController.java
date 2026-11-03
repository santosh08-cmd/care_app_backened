package com.example.care_app.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CareController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Care App!";
    }
}
