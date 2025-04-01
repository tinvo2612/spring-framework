package com.codegym.none_di.controller;

import com.codegym.none_di.service.SmsService;

public class QuestionTwoController {
    SmsService smsService ;

    public QuestionTwoController() {
        smsService = new SmsService();
    }

    public void GửiTinNhắn(){
        System.out.println("Gửi tin nhắn SMS nè hihi");
    }
}
