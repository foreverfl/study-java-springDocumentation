package com.example.springDocumentation.autowiredTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springDocumentation.model.Person;

@SpringBootTest
public class ConstructorInjectionTest {

    private final Person person;

    @Autowired
    public ConstructorInjectionTest(Person person) {
        this.person = person;
    }

    @Test
    public void testConstructorInjection() {
        assertEquals("Yume", person.getFirstName());
        assertEquals("Irido", person.getLastName());
        assertEquals(16, person.getAge());
        assertEquals("female", person.getSex());
    }
}
