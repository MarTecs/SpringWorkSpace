package com.itheima.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prac {
	
	@Test
	public void run()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("app*.xml");
		UserServiceImpl us = (UserServiceImpl) context.getBean("us");
		us.add();
	}

}
