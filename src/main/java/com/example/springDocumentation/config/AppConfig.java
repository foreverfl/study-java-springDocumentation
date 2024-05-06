package com.example.springDocumentation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springDocumentation.bean.MyBean1;
import com.example.springDocumentation.bean.MyBean2;

@Configuration
public class AppConfig {
    @Bean
    public MyBean1 myBean1() {
        return new MyBean1();
    }

    @Bean
    public MyBean2 myBean2() {
        return new MyBean2();
    }
}