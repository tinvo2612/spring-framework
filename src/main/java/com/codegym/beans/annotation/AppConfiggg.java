package com.codegym.beans.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfiggg {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);


        Developer dev1 = (Developer) context.getBean("frontEnd");
        Developer dev2 = (Developer) context.getBean("backEnd");
        Developer dev3 = (Developer) context.getBean("fullstack");

        System.out.println(dev1);
        System.out.println(dev2);
        System.out.println(dev3);

        ((AnnotationConfigApplicationContext) context).close();
    }
}
