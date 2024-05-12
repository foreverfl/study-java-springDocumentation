package com.example.springDocumentation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springDocumentation.model.Person;

@RestController
@RequestMapping("/responseBody")
public class ResponseBodyController {

    @GetMapping("/getPerson") // http://localhost:8080/responseBody/getPerson
    @ResponseBody // @RestController를 class에 다는 순간, 메서드는 전부 @ResponseBody가 적용되므로 의미는 없음
    public Person getPerson() {
        Person person = new Person();
        person.setFirstName("Nagisa");
        person.setLastName("Minase");
        person.setAge(15);
        person.setSex("female");
        return person;
    }
}
