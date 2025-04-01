package com.codegym.use_di.controller;

import com.codegym.use_di.service.InterfaceMain;

public class DiQuestionTwoController {
    private InterfaceMain interfaceMain;
    public DiQuestionTwoController(InterfaceMain interfaceMain) {
        this.interfaceMain = interfaceMain;
    }
    public void send(){
        interfaceMain.sendMessage();
    }
}
