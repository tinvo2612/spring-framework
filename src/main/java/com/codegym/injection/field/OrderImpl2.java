package com.codegym.injection.field;
import org.springframework.stereotype.Component;

@Component
public class OrderImpl2 implements Order {
    @Override
    public String DatHang(){
        return "OrderImpl2";
    }
}
