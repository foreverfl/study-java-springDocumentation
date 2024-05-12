package com.example.springDocumentation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springDocumentation.model.Person;
import com.example.springDocumentation.model.PersonWithBindParam;

@RestController
@RequestMapping("/modelAttribute")
public class ModelAttributeController {

    @PostMapping("/editPerson") // 요청 파라미터를 Person 객체에 바인딩하여 저장
    public Person editPerson(@ModelAttribute Person person) {
        return person;
    }

    // 로컬 컨버터 메서드
    private Person stringToPerson(String source) {
        // source는 "name,age,sex" 형태로 가정
        String[] parts = source.split(",");
        Person p = new Person();
        p.setFirstName(parts[0]);
        p.setAge(Integer.parseInt(parts[1]));
        p.setSex(parts[2]);
        return p;
    }

    @GetMapping("/getPerson/{info}") // http://localhost:8080/modelAttribute/getPerson/John,30,Male
    public Person getPerson(@PathVariable("info") String info) {
        Person person = stringToPerson(info); // 로컬 컨버터 함수를 사용하여 문자열을 Person 객체로 변환
        return person;
    }

    @GetMapping("/getPersonWithParam") // http://localhost:8080/modelAttribute/getPersonWithParam?first-name=John&last-name=Doe&age=30&sex=male
    public PersonWithBindParam getPersonWithParam(
            @RequestParam("first-name") String firstName,
            @RequestParam("last-name") String lastName,
            @RequestParam("age") int age,
            @RequestParam("sex") String sex) {

        return new PersonWithBindParam(firstName, lastName, age, sex);
    }

    @GetMapping("/getStaticPerson") // http://localhost:8080/modelAttribute/getStaticPerson
    public Person getStaticPerson(@ModelAttribute(binding = false) Person person) {
        // 사전에 정의된 또는 다른 방법으로 생성된 Person 객체를 사용
        person.setFirstName("Nagisa");
        person.setLastName("Minase");
        person.setAge(15);
        person.setSex("female");
        return person;
    }

    @GetMapping("/getPersonWithBindingResult") // http://localhost:8080/modelAttribute/getPersonWithBindingResult?first-name=Nagisa&last-name=Minase&age=15&sex=female
    public ResponseEntity<?> getPersonWithBindingResult(@ModelAttribute Person person, BindingResult result) {
        if (result.hasErrors()) {
            // 오류 응답을 JSON 형태로 반환
            System.out.println("BindingResult has a problem.");
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Error in form submission: " + result.getAllErrors());
        }

        System.out.println("BindingResult is normal.");
        return ResponseEntity.ok(person); // 성공 응답을 JSON 형태로 반환

    }

    @GetMapping("/getPersonWithValidated") // http://localhost:8080/modelAttribute/getPersonWithValidated?first-name=Nagisa&last-name=Minase&age=15&sex=female
    public ResponseEntity<?> getPersonWithValidated(
            @Validated @ModelAttribute Person person,
            BindingResult result) {

        if (result.hasErrors()) {
            // 데이터 바인딩 및 유효성 검사에서 오류가 발견되면 오류 메시지를 반환
            System.out.println("response is not validated.");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result.getAllErrors());
        }

        // 유효성 검사 통과 시, 정상적인 Person 객체를 반환
        System.out.println("response is validated.");
        return ResponseEntity.ok(person);
    }
}
