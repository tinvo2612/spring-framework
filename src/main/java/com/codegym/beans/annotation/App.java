package com.codegym.beans.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class App {
    @Bean
    public Developer fullstack (){
        Developer developer = new Developer();
        developer.setId(1);
        developer.setName("Võ Việt Tín");
        developer.setMajor("FullStack");
        return developer;
    }

    @Bean
    public Developer frontEnd(){
        Developer developer = new Developer();
        developer.setId(2);
        developer.setName("Front");
        developer.setMajor("FontEnd");
        return developer;
    }

    @Bean
    public Developer backEnd(){
        Developer developer = new Developer();
        developer.setId(3);
        developer.setName("Back");
        developer.setMajor("BackEnd");
        return developer;
    }
}
