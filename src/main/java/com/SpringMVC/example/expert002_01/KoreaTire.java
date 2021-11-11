package com.SpringMVC.example.expert002_01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "tire1")
public class KoreaTire implements Tire {
    @Override
    public String getBrand() {
        return "코리아 타이어";
    }
}
