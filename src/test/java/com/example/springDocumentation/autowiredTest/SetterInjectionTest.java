package com.example.springDocumentation.autowiredTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springDocumentation.model.Person;

@SpringBootTest
public class SetterInjectionTest {

    private Person person;

    @Autowired
    public void setPerson(Person person) {
        this.person = person;
    }

    @Test
    public void testSetterInjection() {
        assertEquals("Yume", person.getFirstName());
        assertEquals("Irido", person.getLastName());
        assertEquals(16, person.getAge());
        assertEquals("female", person.getSex());
    }
}