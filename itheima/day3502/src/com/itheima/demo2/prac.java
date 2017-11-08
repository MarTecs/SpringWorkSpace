package com.itheima.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 通过构造方法进行传值
 * @author SiVan
 *
 */
public class prac {
	
	@Test
	public void run() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person per = (Person) context.getBean("person");
		System.out.println(per.toString());
	}

}
