package com.itheima.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 采用p空间语言进行属性的赋值与操作
 * @author SiVan
 */
public class Prac {
	
	/*
	@Test
	public void run() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car = (Car) context.getBean("car2");
		System.out.println(car.toString());
	}
	*/
	
	@Test
	public void run2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) context.getBean("person2");
		System.out.println(person.toString());
	}

}
