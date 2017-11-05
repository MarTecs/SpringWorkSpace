package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.StudentService;

public class Test3 {

	public static void main(String[] args)  {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService service = (StudentService) applicationContext.getBean("StudentService");
		service.delStudent();
		
	}
}
