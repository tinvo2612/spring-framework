package com.codegym.use_di.controller;

import com.codegym.use_di.service.InterfaceMain;

public class DiQuestionOneController {
    private InterfaceMain interfaceMain;
    public DiQuestionOneController(InterfaceMain interfaceMain) {
        this.interfaceMain = interfaceMain;
    }
    public void send(){
        interfaceMain.sendMessage();
    }
}
