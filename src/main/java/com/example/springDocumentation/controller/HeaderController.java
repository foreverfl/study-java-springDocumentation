package com.example.springDocumentation.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeaderController {

    @GetMapping("/headers")
    public ResponseEntity<Map<String, String>> showHeaders(
            @RequestHeader("Accept-Encoding") String encoding,
            @RequestHeader("Keep-Alive") long keepAlive,
            @RequestHeader(value = "Accept-Language", required = false) String language) {
        Map<String, String> response = new HashMap<>();
        response.put("Accept-Encoding", encoding);
        response.put("Keep-Alive", String.valueOf(keepAlive));
        response.put("Accept-Language", language != null ? language : "Not provided");

        return ResponseEntity.ok(response);
    }
}
