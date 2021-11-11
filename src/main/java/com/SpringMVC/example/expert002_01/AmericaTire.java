package com.SpringMVC.example.expert002_01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "tire2")
public class AmericaTire implements Tire {
    @Override
    public String getBrand() {
        return "미국 타이어";
    }
}
