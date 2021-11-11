package com.SpringMVC.example.expert002_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private final Tire tire;

//    @Autowired 생성자 하나면 생략 가능
    public Car(@Qualifier("tire2") Tire tire) {
        this.tire = tire;
    }

    public String getTireBrand() {
        return "장착된 타이어: " + tire.getBrand();
    }
}
