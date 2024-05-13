package com.example.springDocumentation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springDocumentation.model.Person;

@Configuration
public class IoCContainerConfig {

    // 필드 주입을 위한 빈
    @Bean
    public Person person() {
        Person person = new Person();
        return person;
    }

    // 생성자 주입을 위한 빈
    @Bean
    public Person personWithConstructor() {
        return new Person("Yume", "Irido", 16, "female");
    }

    // 세터 주입을 위한 빈
    @Bean
    public Person personWithSetter() {
        Person person = new Person();
        person.setFirstName("Yume");
        person.setLastName("Irido");
        person.setAge(16);
        person.setSex("female");
        return person;
    }
}