package com.example.springDocumentation.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springDocumentation.model.Person;

@RestController
@RequestMapping("/responseEntity")
public class ResponseEntityController {

    @GetMapping("/getPerson") // http://localhost:8080/responseEntity/getPerson
    public ResponseEntity<Person> getPerson() {
        Person person = new Person();
        person.setFirstName("Nagisa");
        person.setLastName("Minase");
        person.setAge(15);
        person.setSex("female");

        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "Value");

        return ResponseEntity.ok()
                .headers(headers)
                .body(person);
    }

}
