package com.example.springDocumentation.model;

public class MyBean3 {
    private MyBean1 dependency1;
    private MyBean2 dependency2;

    public MyBean1 getDependency1() {
        return dependency1;
    }

    public void setDependency1(MyBean1 dependency1) {
        this.dependency1 = dependency1;
    }

    public MyBean2 getDependency2() {
        return dependency2;
    }

    public void setDependency2(MyBean2 dependency2) {
        this.dependency2 = dependency2;
    }

    @Override
    public String toString() {
        return "MyBean3{" +
                "dependency1=" + dependency1 +
                ", dependency2=" + dependency2 +
                '}';
    }
}
