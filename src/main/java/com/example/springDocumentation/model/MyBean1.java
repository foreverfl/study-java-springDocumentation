package com.example.springDocumentation.model;

public class MyBean1 {
    private String name;

    public MyBean1() {
        this.name = "Default MyBean1 Name";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyBean1{name='" + name + "'}";
    }
}
