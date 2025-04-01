package com.codegym.beans.xml;

//import org.jboss.weld.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext project = new ClassPathXmlApplicationContext("hihihi.xml");
        ApplicationContext tinvo= new ClassPathXmlApplicationContext("tinvo.xml");
        ApplicationContext hahaha = new ClassPathXmlApplicationContext("filenaytestxmlne.xml");

        Developer be = (Developer) project.getBean("backend");
        System.out.println(be);

        Developer fe = (Developer) project.getBean("frontend");
        System.out.println(fe);

        Developer tt = (Developer) tinvo.getBean("tinvo");
        System.out.println(tt);

        Developer vt = (Developer) tinvo.getBean("viettin");
        System.out.println(vt);


        ProductsTestNe xam1 = (ProductsTestNe) hahaha.getBean("test");
        ProductsTestNe xam2 = (ProductsTestNe) hahaha.getBean("test1");
        ProductsTestNe xam3 = (ProductsTestNe) hahaha.getBean("test2");
        ProductsTestNe xam4 = (ProductsTestNe) hahaha.getBean("test3");
        System.out.println(xam1);
        System.out.println(xam2);
        System.out.println(xam3);
        System.out.println(xam4);

        fe.setName("Tín Võ");
        System.out.println(fe);

        ((ClassPathXmlApplicationContext) project).close();
        ((ClassPathXmlApplicationContext) tinvo).close();
        ((ClassPathXmlApplicationContext) hahaha).close();

    }
}
