package com.SpringMVC.example.expert002_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Driver {

    private final Car car;

    @Autowired
    public Driver(Car car) {
        this.car = car;
    }

    public String brandName() {
        return car.getTireBrand();
    }
}
