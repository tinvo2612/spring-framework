package com.codegym.injection.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerImpl implements Customer {

    @Autowired
    private Order order;

    @Override
    public String an(){
        return order.DatHang();
    }

    @Override
    public String uong(){
        return order.DatHang();
    }

}
