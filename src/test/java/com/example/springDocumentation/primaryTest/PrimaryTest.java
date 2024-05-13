package com.example.springDocumentation.primaryTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springDocumentation.model.Person;

@SpringBootTest
public class PrimaryTest {
    @Autowired
    private Person person; // primaryPerson이 주입될 것임

    @Test
    public void testPrimaryPersonInjection() {
        assertEquals("Yume", person.getFirstName());
        assertEquals("Irido", person.getLastName());
        assertEquals(16, person.getAge());
        assertEquals("female", person.getSex());
    }
}
