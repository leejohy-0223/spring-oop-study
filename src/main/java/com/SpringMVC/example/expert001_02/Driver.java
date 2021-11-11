package com.SpringMVC.example.expert001_02;


public class Driver {
    public static void main(String[] args) {
        Tire tire = new KoreaTire();
        Car car = new Car(tire); // 자동차는 더 이상 어떤 타이어를 장착할 지 고민할 필요 없다. Driver가 넣어준다.
        System.out.println(car.getTireBrand());
    }
}
