package com.example.springDocumentation.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("sessionAttributes")
@SessionAttributes("name")
public class SessionAttributesController {

    @GetMapping("/setName") // http://localhost:8080/sessionAttributes/setName
    public Map<String, Object> setName(Model model, HttpServletRequest request) {
        @SuppressWarnings("unused")
        HttpSession session = request.getSession(); // 응답이 이미 커밋된 후에는 세션을 생성할 수 없기 때문에 새션을 미리 생성.

        model.addAttribute("name", "Nagisa");

        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Name set to session.");
        response.put("currentSessionName", model.getAttribute("name"));
        return response;
    }

    @GetMapping("/getName") // http://localhost:8080/sessionAttributes/getName
    public Map<String, Object> getName(@ModelAttribute("name") String name, SessionStatus status) {
        Map<String, Object> response = new HashMap<>();
        if (name != null) {
            response.put("status", "success");
            response.put("message", "Name retrieved from session: " + name);
            response.put("currentSessionName", name);
            status.setComplete(); // 세션에서 name 객체 제거
        } else {
            response.put("status", "error");
            response.put("message", "No name found in session.");
        }
        return response;
    }
}
