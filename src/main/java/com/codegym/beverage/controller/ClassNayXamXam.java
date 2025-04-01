package com.codegym.beverage.controller;

import com.codegym.beverage.service.MuonPhaNuocThiVoDay;

public class ClassNayXamXam {
    private MuonPhaNuocThiVoDay phanuoc;

    public ClassNayXamXam(MuonPhaNuocThiVoDay phanuoc) {
        this.phanuoc = phanuoc;
    }
    public void pha(){
        phanuoc.brew();
    }
}
