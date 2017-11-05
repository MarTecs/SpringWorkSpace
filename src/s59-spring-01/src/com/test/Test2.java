package com.test;

import java.io.FileNotFoundException;
import java.util.Map;

import org.dom4j.DocumentException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Student;

public class Test2 {

	public static void main(String[] args) throws FileNotFoundException,
			ClassNotFoundException, InstantiationException,
			IllegalAccessException, DocumentException {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		Student student = (Student) applicationContext.getBean("Student");
		System.out.println(student.getStuid() + "\t" + student.getStuname());

		String[] strings = student.getLoves();
		for (String string : strings) {
			System.out.println(string);
		}
		
		Map map = student.getOthers();
		System.out.println(map.get("age"));
		System.out.println(map.get("height"));
	
	}

}
