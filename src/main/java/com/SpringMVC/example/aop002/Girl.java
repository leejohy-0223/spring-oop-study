package com.SpringMVC.example.aop002;

import org.springframework.stereotype.Component;

@Component(value = "girl")
public class Girl implements Person {

    @Override
    public void runSomething() {
        System.out.println("넷플릭스를 본다.");
    }
}
