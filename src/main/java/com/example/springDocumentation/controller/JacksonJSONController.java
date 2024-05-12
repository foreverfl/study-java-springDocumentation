package com.example.springDocumentation.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springDocumentation.model.PersonWithJackson;
import com.fasterxml.jackson.annotation.JsonView;

@RestController
@RequestMapping("/jacksonJSON")
public class JacksonJSONController {

    @GetMapping("/withSex") // http://localhost:8080/jacksonJSON/withSex
    @JsonView(PersonWithJackson.WithSexView.class)
    public PersonWithJackson getPersonWithSex() {
        PersonWithJackson person = new PersonWithJackson();
        person.setFirstName("Shino");
        person.setLastName("Kiryuu");
        person.setAge(15);
        person.setSex("Female");
        return person;
    }

    @GetMapping("/withoutSex") // http://localhost:8080/jacksonJSON/withoutSex
    @JsonView(PersonWithJackson.WithoutSexView.class)
    public PersonWithJackson getPersonWithoutSex() {
        PersonWithJackson person = new PersonWithJackson();
        person.setFirstName("Shino");
        person.setLastName("Kiryuu");
        person.setAge(15);
        person.setSex("Female");
        return person;
    }

    @GetMapping("/withSexUsingMappingJacksonValue") // http://localhost:8080/jacksonJSON/withSexUsingMappingJacksonValue
    public MappingJacksonValue getPersonWithMappingJacksonValue() {
        PersonWithJackson person = new PersonWithJackson();
        person.setFirstName("Nagisa");
        person.setLastName("Minase");
        person.setAge(15);
        person.setSex("Female");
        MappingJacksonValue value = new MappingJacksonValue(person);
        value.setSerializationView(PersonWithJackson.WithoutSexView.class);
        return value;
    }

    @GetMapping("/withSexUsingModel") // http://localhost:8080/jacksonJSON/withSexUsingModel
    public Map<String, Object> getPersonWithSexUsingModel(Model model) {
        PersonWithJackson person = new PersonWithJackson();
        person.setFirstName("Saki");
        person.setLastName("Saki");
        person.setAge(15);
        person.setSex("Female");

        model.addAttribute("person", person);
        model.addAttribute(JsonView.class.getName(), PersonWithJackson.WithSexView.class);

        Map<String, Object> response = new HashMap<>();
        response.put("model", model.asMap());
        return response;
    }
}
