package com.codegym.beans.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppNayTestNe {
    public static void main(String[] args) {
        ApplicationContext testbenmain= new ClassPathXmlApplicationContext("filenaytestxmlne.xml");

        ProductsTestNe doituongmoi = (ProductsTestNe) testbenmain.getBean("test");
        System.out.println(doituongmoi);

        ProductsTestNe doituongmoi1 = (ProductsTestNe) testbenmain.getBean("test1");
        System.out.println(doituongmoi1);

        ProductsTestNe doituongmoi2 = (ProductsTestNe) testbenmain.getBean("test2");
        System.out.println(doituongmoi2);

        ProductsTestNe doituongmoi3 = (ProductsTestNe) testbenmain.getBean("test3");
        System.out.println(doituongmoi3);

    }
}
