package com.example.springDocumentation.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/requestparam")
public class RequestParamController {
    @GetMapping("/greet") // http://localhost:8080/requestparam/greet?name=rika
    public String greet(@RequestParam String name) {
        return "Hello, " + name; // Hello! rika
    }

    @GetMapping("/greetWithOptional") // http://localhost:8080/requestparam/greetWithOptional
    public String greetWithOptionalName(@RequestParam(required = false, defaultValue = "Guest") String name) {
        return "Hello, " + name; // Hello, Guest
    }

    @GetMapping("/squareNumber") // http://localhost:8080/requestparam/squareNumber?number=5
    public String squareNumber(@RequestParam int number) {
        int square = number * number;
        return "Square of " + number + " is " + square; // Square of 5 is 25
    }

    @GetMapping("/showDetails") // http://localhost:8080/requestparam/showDetails?ids=1,2,3
    public String showDetails(@RequestParam List<String> ids) {
        return "Details for IDs: " + ids.stream().collect(Collectors.joining(", ")); // Details for IDs: 1, 2, 3
    }

    @GetMapping("/showParameters") // http://localhost:8080/requestparam/showParameters?param1=value1&param2=value2
    public String showParameters(@RequestParam Map<String, String> params) {
        return "Received parameters: " + params.entrySet().stream()
                .map(entry -> entry.getKey() + "=" + entry.getValue())
                .collect(Collectors.joining(", "));
    }

    @GetMapping("/multiply") // http://localhost:8080/requestparam/multiply?a=10&b=20
    public String multiply(@RequestParam int a, @RequestParam int b) {
        int result = a * b;
        return "Result of " + a + " * " + b + " = " + result;
    }
}
