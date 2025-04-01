package com.codegym.injection.setter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        BeanFactory context = new ClassPathXmlApplicationContext("setter-in-injection.xml");

        Classs classs = (Classs) context.getBean("class");
        System.out.println(classs);
        System.out.println(classs.getStudent().getName());

        ((ClassPathXmlApplicationContext) context).close();
    }
}
