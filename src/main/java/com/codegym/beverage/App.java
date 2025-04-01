package com.codegym.beverage;

import com.codegym.beverage.controller.ClassNayXamXam;
import com.codegym.beverage.service.*;

public class App {
    public static void main(String[] args) {
        MuonPhaNuocThiVoDay coffee1 = new Coffee();
        MuonPhaNuocThiVoDay trane1 = new Tea();
        MuonPhaNuocThiVoDay trasua1 = new MilkTea();
        MuonPhaNuocThiVoDay nuocngot1 = new SoftDrink();

        ClassNayXamXam caphe = new ClassNayXamXam(coffee1);
        ClassNayXamXam tra = new ClassNayXamXam(trane1);
        ClassNayXamXam trasua = new ClassNayXamXam(trasua1);
        ClassNayXamXam nuocngot = new ClassNayXamXam(nuocngot1);

        caphe.pha();
        tra.pha();
        trasua.pha();
        nuocngot.pha();
    }
}
