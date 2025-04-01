package com.codegym.beans.apptestannotation;

import com.codegym.beans.annotation.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfigTest {
    public static void main(String[] args) {
        ApplicationContext testbenConfig = new AnnotationConfigApplicationContext(AppTest.class);

        ProductsTest doituongbenConfig = (ProductsTest) testbenConfig.getBean("iphone");
        ProductsTest doituongbenConfig2 = (ProductsTest) testbenConfig.getBean("samsung");
        ProductsTest doituongbenConfig3 = (ProductsTest) testbenConfig.getBean("oppo");

        System.out.println(doituongbenConfig);
        System.out.println(doituongbenConfig2);
        System.out.println(doituongbenConfig3);

        ((AnnotationConfigApplicationContext) testbenConfig).close();
    }
}
