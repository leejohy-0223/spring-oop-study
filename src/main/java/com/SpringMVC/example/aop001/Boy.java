package com.SpringMVC.example.aop001;

public class Boy {
    public void runSomething() {
        System.out.println("문을 열고 집으로 들어간다.");

        try {
            System.out.println("컴퓨터 게임한다");
        } catch (Exception e) {
            if(e.getMessage().equals("집에 불남")) {
                System.out.println("119에 신고한다.");
            }
        } finally {
            System.out.println("소등 후 잔다.");
        }

        System.out.println("자물쇠를 잠그고 집을 나선다.");
    }
}
