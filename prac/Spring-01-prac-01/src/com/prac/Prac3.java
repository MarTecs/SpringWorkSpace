package com.prac;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Student;

/**
 * 
 * @author SiVan
 *	ʹ��Spring�����ļ���ȡMap�����Լ�����
 */
public class Prac3 {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student)context.getBean("student");
		
		System.out.println(student.getStuId());
		System.out.println(student.getStuName());
		
		String[] loves = student.getLoves();
		for (String string : loves) {
			System.out.println(string);
		}
		
		Map map = student.getStuMaps();
		System.out.println(map.get("age"));
		
		
		
		
	}
}
