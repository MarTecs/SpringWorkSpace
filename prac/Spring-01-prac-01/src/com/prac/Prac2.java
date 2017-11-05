package com.prac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Student;

/**
 * 配置文件中使用set方法进行赋值
 * @author SiVan
 *
 */
public class Prac2 {

	public static void main(String[] args) {
		
		//读取总配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student.getStuId());
		System.out.println(student.getStuName());
		
		
		
	}
}
