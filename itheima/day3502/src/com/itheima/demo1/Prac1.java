package com.itheima.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prac1 {
	
	@Test
	public void run() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService cs = (CustomerService) context.getBean("customerService");
		cs.save();
	}

}
