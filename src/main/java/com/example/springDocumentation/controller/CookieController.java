package com.example.springDocumentation.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class CookieController {

    // 쿠키를 설정하는 메서드
    @GetMapping("/setCookie") // http://localhost:8080/setCookie
    public Map<String, Object> setCookie(HttpServletResponse response) {
        // 쿠키 생성
        String uniqueID = UUID.randomUUID().toString();
        Cookie cookie = new Cookie("JSESSIONID", uniqueID);
        cookie.setHttpOnly(true); // HttpOnly 속성 설정
        cookie.setMaxAge(7 * 24 * 60 * 60); // 쿠키의 유효 시간을 1주일로 설정
        response.addCookie(cookie); // 응답에 쿠키 추가

        Map<String, Object> result = new HashMap<>();
        result.put("message", "Cookie set successfully");
        result.put("JSESSIONID", uniqueID);
        return result;
    }

    // 설정된 쿠키를 읽는 메서드
    @GetMapping("/readCookie") // http://localhost:8080/readCookie
    public ResponseEntity<Map<String, String>> readCookie(
            @CookieValue(name = "JSESSIONID", defaultValue = "No cookie") String jsessionId) {
        Map<String, String> result = new HashMap<>();
        result.put("JSESSIONID", jsessionId);
        return ResponseEntity.ok(result);
    }
}
