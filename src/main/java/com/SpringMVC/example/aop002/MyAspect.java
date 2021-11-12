package com.SpringMVC.example.aop002;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

//    @Before("execution(public void com.SpringMVC.example.aop002.Boy.runSomething())")
    @Before("execution(* runSomething())")
    public void before(JoinPoint joinPoint) {
        System.out.println("얼굴 인식 확인 : 문을 개방한다.");
    }
}
