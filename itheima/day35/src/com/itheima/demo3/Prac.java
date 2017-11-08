package com.itheima.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prac {
	@Test
	public void run() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		for ( int i = 0; i < 100; i++) {
			UserService us = (UserService) context.getBean("userservice");
			System.out.println(us.toString());
		}
		context.close();
	}

}
