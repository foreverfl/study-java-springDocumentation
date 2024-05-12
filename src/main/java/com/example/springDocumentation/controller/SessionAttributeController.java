package com.example.springDocumentation.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("SessionAttribute")
public class SessionAttributeController {

    @GetMapping("setUserId") // http://localhost:8080/SessionAttribute/setUserId?userId=Nagisa
    public ResponseEntity<Map<String, String>> setUserId(
            @RequestParam("userId") String userId,
            HttpSession session) {

        session.setAttribute("userId", userId);

        Map<String, String> response = new HashMap<>();
        response.put("message", "User ID set to: " + userId);
        return ResponseEntity.ok(response);
    }

    @GetMapping("removeUserId") // http://localhost:8080/SessionAttribute/removeUserId?userId=Nagisa
    public ResponseEntity<Map<String, String>> removeUserId(HttpSession session) {

        session.removeAttribute("userId");

        Map<String, String> response = new HashMap<>();
        response.put("message", "User ID removed from session.");

        return ResponseEntity.ok(response);
    }

    @GetMapping("getUserId") // http://localhost:8080/SessionAttribute/getUserId
    public ResponseEntity<Map<String, String>> getUserId(
            @SessionAttribute(value = "userId", required = false) String userId, HttpSession session) {
        Map<String, String> response = new HashMap<>();
        System.out.println("session: " + session.getAttribute("userId"));

        if (userId != null) {
            response.put("message", "User ID: " + userId);
        } else {
            response.put("message", "User ID not found in session.");
        }

        return ResponseEntity.ok(response);
    }
}
