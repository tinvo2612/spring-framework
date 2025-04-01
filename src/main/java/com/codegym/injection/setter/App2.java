package com.codegym.injection.setter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        BeanFactory context = new ClassPathXmlApplicationContext("setter-in-injection.xml");

        Tran tranStudent = (Tran) context.getBean("tran");
        System.out.println(tranStudent);

        ((ClassPathXmlApplicationContext) context).close();
    }
}
