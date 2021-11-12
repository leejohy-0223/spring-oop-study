package com.SpringMVC.example.aop002;

import org.springframework.stereotype.Component;

@Component(value = "boy")
public class Boy implements Person {
    @Override
    public void runSomething() {
        System.out.println("컴퓨터로 게임을 한다."); // 핵심 관심사만 구현했다.
    }
}
