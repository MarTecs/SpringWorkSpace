package com.itheima.demo5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 对常用集合进行配置
 * @author SiVan
 *
 */
public class Prac {
	
	
	@Test
	public void run() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) context.getBean("person4");
		System.out.println(person.toString());
	}

}
