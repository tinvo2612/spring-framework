package com.codegym.injection.constructor;

public class controllerForDoiAn {
    private DoiAn doiAn;

    public controllerForDoiAn (DoiAn doiAn){
        this.doiAn = doiAn;
    }
    public void doiAn(){
        doiAn.DoiAn();
    }
}
