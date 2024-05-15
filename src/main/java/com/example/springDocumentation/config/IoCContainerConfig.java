package com.example.springDocumentation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.example.springDocumentation.model.MyBean1;
import com.example.springDocumentation.model.MyBean2;
import com.example.springDocumentation.model.MyBean3;

@Configuration
public class IoCContainerConfig {
    @Bean
    public MyBean1 myBean1() {
        return new MyBean1();
        // 필요한 경우 collaborators 및 configuration 설정
    }

    @Bean
    public MyBean2 myBean2() {
        return new MyBean2();
        // 필요한 경우 collaborators 및 configuration 설정
    }

    @Bean
    @DependsOn({ "myBean1", "myBean2" })
    public MyBean3 myBean3() {
        MyBean3 myBean3 = new MyBean3();
        myBean3.setDependency1(myBean1());
        myBean3.setDependency2(myBean2());
        return myBean3;
    }
}