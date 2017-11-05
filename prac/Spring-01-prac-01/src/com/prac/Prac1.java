package com.prac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Student;

/**
 * 获取对象之后，我们进行手动赋值
 * @author SiVan
 *
 */
public class Prac1 {
	
	
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//直接获取Spring容器生成的Student对象
		Student student = (Student) context.getBean("student");
		student.setStuId(1);
		System.out.println(student.getStuId());
		
		
		
	}

}
