package com.example.springDocumentation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeApiController {

    @GetMapping("/")
    public String home() {
        return "{\"message\": \"Welcome to the Home Page!\"}";
    }
}