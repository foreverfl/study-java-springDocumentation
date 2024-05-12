package com.example.springDocumentation.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/requestAttribute")
public class RequestAttributeController {

    @GetMapping("/getName") // http://localhost:8080/requestAttribute/getName
    public ResponseEntity<Map<String, String>> getName(@RequestAttribute("name") String name) {
        Map<String, String> response = new HashMap<>();
        response.put("name", name);
        return ResponseEntity.ok(response);
    }
}
