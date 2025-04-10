package com.codegym.injection.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("khonglam.xml");

        controllerForDoiAn khonglam = (controllerForDoiAn) context.getBean("khonglam");

        khonglam.doiAn();

        ((ClassPathXmlApplicationContext) context).close();
    }
}