package com.test;

import java.io.FileNotFoundException;

import org.dom4j.DocumentException;

import com.pojo.Student;
import com.spring.ApplicationContext;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, DocumentException {
		Student student = (Student) ApplicationContext.getInstance("Student");
		//student.setStuid(1);
		System.out.println(student.getStuid());
		//student.setStuname("уехЩ");
		System.out.println(student.getStuname());
	}

}
