package com.itheima.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo2 {
	
	@Test
	public void run() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserServiceImpl us = (UserServiceImpl) context.getBean("userService");
		us.service();
	}
	
	public void run1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao user = (UserDao) context.getBean("userDao");
		user.add();
	}

}
