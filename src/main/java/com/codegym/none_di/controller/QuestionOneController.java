package com.codegym.none_di.controller;

import com.codegym.none_di.service.EmailService;

public class QuestionOneController {
    EmailService emailService;

    public QuestionOneController() {
        emailService = new EmailService();
    }

    public void GửiTinNhắn(){
        System.out.println("Gửi email nè hihi");
    }

    public void tintin(){
        emailService.tinvo();
    }

    public void viettin(String questionOneController){
        System.out.println(questionOneController);
    }
}
