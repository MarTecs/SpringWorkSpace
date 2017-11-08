package com.itheima.demo6;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prac {
	
	@Test
	public void run() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService us = (UserService) context.getBean("userService");
		us.add();
		
	}

}
