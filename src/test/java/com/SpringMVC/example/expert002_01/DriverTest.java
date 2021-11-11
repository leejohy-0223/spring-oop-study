package com.SpringMVC.example.expert002_01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DriverTest {

    @Autowired
    private Driver driver;

    @Test
    void 브랜드네이밍_테스트() {
        Assertions.assertEquals("장착된 타이어: 미국 타이어", driver.brandName());
    }
}