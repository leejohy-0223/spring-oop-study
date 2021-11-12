package com.SpringMVC.example;

import com.SpringMVC.example.aop002.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
//@EnableAspectJAutoProxy  // 빈으로된 Aspect의 프록시 생성이 가능하도록 한다. -> @SpringBootApplication에 들어있다.!
public class ExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
	}

	@Autowired
	@Qualifier("boy")
	private Person romeo;

	@Autowired
	@Qualifier("girl")
	private Person juliet;

	@Override
	public void run(String... args) throws Exception {
		romeo.runSomething();
		juliet.runSomething();
	}
}
