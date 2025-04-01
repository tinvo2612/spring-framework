package com.codegym.injection.field;
import org.springframework.stereotype.Component;

@Component
public class OrderImpl implements Order {
    @Override
    public String DatHang(){
        return "OrderImpl1";
    }
}
