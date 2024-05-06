package com.example.springDocumentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springDocumentation.bean.MyBean1;

public class BeanCountApplicationInXML {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AppConfig.XML");

        int beanCount = context.getBeanDefinitionCount();
        System.out.println("등록된 빈의 개수: " + beanCount);

        String[] beanNames = context.getBeanDefinitionNames();
        System.out.println("등록된 빈의 이름:");
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
        System.out.println("===================================");

        MyBean1 myBean1 = context.getBean(MyBean1.class);
        MyBean1.MyInnerBean innerBean = myBean1.innerBean;
        System.out.println("Inner Bean Message: " + innerBean.getMessage());

        context.close();
    }
}
