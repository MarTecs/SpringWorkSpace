package com.itheima.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	/*
	@org.junit.Test
	public void run() {
		UserServiceImpl usl = new UserServiceImpl();
		usl.sayHello();
	}
	*/
	
	/*
	@org.junit.Test
	public void run2() {
		UserService us = new UserServiceImpl() ;
		us.sayHello();
	}
	*/
	
	/*
	 * 使用Spring配置文件进行操作
	 */
	@org.junit.Test
	public void run3() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService us = (UserService) applicationContext.getBean("userService");
		us.sayHello();
	}
	
}
