package com.itheima.demo4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 采用spel表达式对spring创建的进行属性的赋值，采用 #{}进行赋值
 * @author SiVan
 *
 */
public class Prac {
	
	@Test
	public void run() {
		/*
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car = (Car) context.getBean("car3");
		System.out.println(car.toString());
		*/
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) context.getBean("person3");
		System.out.println(person.toString());
	}
}
