package com.codegym.none_di.controller;

import com.codegym.none_di.service.FacebookService;

public class QuestionThreeController {
    FacebookService facebookService;

    public QuestionThreeController() {
        facebookService = new FacebookService();
    }

    public void GửiTinNhắn(){
        System.out.println("Gửi tin nhắn Facebook nè hihi");
    }
}
