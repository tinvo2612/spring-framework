package com.codegym.beans.apptestannotation;

import org.springframework.context.annotation.Bean;

public class AppTest {
    @Bean
    public ProductsTest samsung(){
        ProductsTest product = new ProductsTest();

        product.setId(2);
        product.setName("Samsung");
        product.setDescription("technoligy");
        product.setPrice(200.0);
        return product;
    }

    @Bean
    public ProductsTest iphone(){
        ProductsTest product = new ProductsTest();

        product.setId(1);
        product.setName("Iphone");
        product.setDescription("Luxury");
        product.setPrice(500.0);
        return product;
    }


    @Bean
    public ProductsTest oppo(){
        ProductsTest product = new ProductsTest();

        product.setId(3);
        product.setName("Opppo");
        product.setDescription("Droptest");
        product.setPrice(100.0);
        return product;
    }
}
