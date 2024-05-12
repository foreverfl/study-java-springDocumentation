package com.example.springDocumentation.model;

import org.springframework.web.bind.annotation.BindParam;

public class PersonWithBindParam {
    private String firstName;
    private String lastName;
    private int age;
    private String sex;

    public PersonWithBindParam(@BindParam("first-name") String firstName,
            @BindParam("last-name") String lastName,
            @BindParam("age") int age,
            @BindParam("sex") String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    // Getter and Setter
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

}
