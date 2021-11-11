package com.SpringMVC.example.expert001_02;

public class Car {
    Tire tire;

    // 생성자 부분이 달라짐, 외부에서 주입 받는다.
    public Car(Tire tire) {
        this.tire = tire;
    }

    public String getTireBrand() {
        return "장착된 타이어: " + tire.getBrand();
    }
}
