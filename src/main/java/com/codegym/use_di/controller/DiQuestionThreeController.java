package com.codegym.use_di.controller;

import com.codegym.use_di.service.InterfaceMain;

public class DiQuestionThreeController {
    private InterfaceMain interfaceMain;
    public DiQuestionThreeController(InterfaceMain interfaceMain) {
        this.interfaceMain = interfaceMain;
    }
    public void send(){
        interfaceMain.sendMessage();
    }
}
