package com.example.springDocumentation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springDocumentation.model.Person;

@Controller
@RequestMapping("/model")
public class ModelController {
    @GetMapping("/model") // http://localhost:8080/model/model
    public String modelExample(Model model) {
        model.addAttribute("message", "kanojo mo kanojo");

        Person person = new Person();
        person.setFirstName("Nagisa");
        person.setLastName("Minase");
        person.setAge(15);
        person.setSex("female");
        model.addAttribute("person", person);
        return "model/model";
    }

    @GetMapping("/modelAttribute") // http://localhost:8080/model/modelAttribute
    public String modelAttributeExample(@ModelAttribute("person") Person person, Model model) {
        model.addAttribute("message", "kanojo mo kanojo");

        person.setFirstName("Saki");
        person.setLastName("Saki");
        person.setAge(15);
        person.setSex("female");

        return "model/modelAttribute";
    }

    @GetMapping("/customModelAttribute") // http://localhost:8080/model/customModelAttribute?firstName=Rika&lastName=Hoshizaki&age=15&sex=female
    public String customModeleAttributeExample(@ModelAttribute("person") Person person, Model model) {
        model.addAttribute("message", "kanojo mo kanojo");
        return "model/customModelAttribute";
    }

    @ModelAttribute("person")
    public Person addPerson(@RequestParam(required = false, defaultValue = "") String firstName,
            @RequestParam(required = false, defaultValue = "") String lastName,
            @RequestParam(required = false, defaultValue = "0") int age,
            @RequestParam(required = false, defaultValue = "") String sex) {
        Person person = new Person();
        if (!firstName.isEmpty()) {
            person.setFirstName(firstName);
        }
        if (!lastName.isEmpty()) {
            person.setLastName(lastName);
        }
        if (age != 0) {
            person.setAge(age);
        }
        if (!sex.isEmpty()) {
            person.setSex(sex);
        }
        return person;
    }
}
