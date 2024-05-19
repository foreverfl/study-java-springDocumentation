package com.example.springDocumentation.model;

public class MyBean4 {
    private String name;

    public MyBean4() {
        this.name = "Default MyBean4 Name";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyBean4{name='" + name + "'}";
    }
}
