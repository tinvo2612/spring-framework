package com.codegym.injection.field;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("order.xml");

        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer.an());
        System.out.println(customer.uong());

        context.close();
    }
}
