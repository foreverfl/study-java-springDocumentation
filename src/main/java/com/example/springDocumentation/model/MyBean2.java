package com.example.springDocumentation.model;

public class MyBean2 {
    private int value;

    public MyBean2() {
        this.value = 42; // 기본값
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyBean2{value=" + value + "}";
    }
}
