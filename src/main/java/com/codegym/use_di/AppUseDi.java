package com.codegym.use_di;

import com.codegym.use_di.controller.DiQuestionOneController;
import com.codegym.use_di.controller.DiQuestionTwoController;
import com.codegym.use_di.service.DiEmailService;
import com.codegym.use_di.service.DiFacebookService;
import com.codegym.use_di.service.DiSmsService;
import com.codegym.use_di.service.InterfaceMain;

public class AppUseDi {
    public static void main(String[] args) {
        InterfaceMain diEmail = new DiEmailService();
        InterfaceMain diSmS = new DiSmsService();
        InterfaceMain diFacebook = new DiFacebookService();

        DiQuestionOneController diQuestionOneController = new DiQuestionOneController(diEmail);
        DiQuestionTwoController diQuestionTwoController = new DiQuestionTwoController(diSmS);
        DiQuestionTwoController diQuestionThreeController = new DiQuestionTwoController(diFacebook);

        diQuestionOneController.send();
        diQuestionTwoController.send();
        diQuestionThreeController.send();
    }
}
