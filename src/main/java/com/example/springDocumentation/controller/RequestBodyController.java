package com.example.springDocumentation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springDocumentation.model.Person;
import com.example.springDocumentation.model.PersonWithValidated;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/requestBody")
public class RequestBodyController {
    @PostMapping("/createPerson") // http://localhost:8080/requestBody/createPerson
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        return ResponseEntity.ok(person);
    }

    @PostMapping("/createPersonWithValidated") // http://localhost:8080/requestBody/createPersonWithValidated
    public ResponseEntity<PersonWithValidated> createPerson(@Valid @RequestBody PersonWithValidated person) {
        return ResponseEntity.ok(person);
    }
}
