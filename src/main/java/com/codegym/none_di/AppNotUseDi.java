package com.codegym.none_di;

import com.codegym.none_di.controller.QuestionOneController;
import com.codegym.none_di.controller.QuestionThreeController;
import com.codegym.none_di.controller.QuestionTwoController;

public class AppNotUseDi {
    public static void main(String[] args) {
        QuestionOneController email = new QuestionOneController();
        QuestionTwoController sms = new QuestionTwoController();
        QuestionThreeController facebook = new QuestionThreeController();


        email.GửiTinNhắn();
        email.tintin();
        String sout = "1";
        email.viettin(sout);

        sms.GửiTinNhắn();
        facebook.GửiTinNhắn();
    }
}
