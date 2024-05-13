package com.example.springDocumentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.example.springDocumentation.config.IoCContainerConfig;

public class IoCContainerApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(IoCContainerConfig.class);

        int beanCount = context.getBeanDefinitionCount();
        System.out.println("등록된 빈의 개수: " + beanCount);

        String[] beanNames = context.getBeanDefinitionNames();
        System.out.println("등록된 빈의 이름:");
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

        ((AbstractApplicationContext) context).close();
    }

}
