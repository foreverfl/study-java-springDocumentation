package com.example.springDocumentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.example.springDocumentation.config.IoCContainerConfig;
import com.example.springDocumentation.model.MyBean3;

public class IoCContainerApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(IoCContainerConfig.class);

        // 모든 bean을 출력
        int beanCount = context.getBeanDefinitionCount();
        System.out.println("등록된 빈의 개수: " + beanCount);

        String[] beanNames = context.getBeanDefinitionNames();
        System.out.println("등록된 빈의 이름:");
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
        System.out.println("================================");

        // MyBean3을 포함한 모든 bean 출력 (depends-on 확인)
        MyBean3 myBean3 = context.getBean(MyBean3.class);
        System.out.println("MyBean3: " + myBean3);

        ((AbstractApplicationContext) context).close();
    }

}
