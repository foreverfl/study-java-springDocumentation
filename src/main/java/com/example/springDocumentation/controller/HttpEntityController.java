package com.example.springDocumentation.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springDocumentation.model.Person;

@RestController
@RequestMapping("/httpEntity")
public class HttpEntityController {
    @PostMapping("/createPerson") // http://localhost:8080/httpEntity/createPerson
    public ResponseEntity<String> createPerson(HttpEntity<Person> entity) {
        // HttpEntity로부터 Person 객체 얻기 전 null 체크
        if (entity.getBody() == null) {
            return ResponseEntity.badRequest().body("No person data in request body");
        }
        Person person = entity.getBody();
        // 요청 헤더 접근 예시
        // ContentType null 체크
        MediaType contentType = entity.getHeaders().getContentType();
        String contentTypeStr = (contentType != null) ? contentType.toString() : "unknown";

        @SuppressWarnings("null")
        String responseMessage = String.format("Received person: %s %s, Age: %d, Sex: %s, Content-Type: %s",
                person.getFirstName(), person.getLastName(), person.getAge(), person.getSex(), contentTypeStr);

        return ResponseEntity.ok(responseMessage); // 처리 결과 응답
    }
}
