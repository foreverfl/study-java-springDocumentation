package com.example.springDocumentation.model;

import com.fasterxml.jackson.annotation.JsonView;

public class PersonWithJackson {

    public interface WithoutSexView {
    };

    public interface WithSexView extends WithoutSexView {
    };

    private String firstName;
    private String lastName;
    private int age;
    private String sex;

    public PersonWithJackson() {
    } // 기본 생성자 필요

    // Getter and Setter
    @JsonView(WithoutSexView.class)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonView(WithoutSexView.class)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonView(WithoutSexView.class)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @JsonView(WithSexView.class)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
