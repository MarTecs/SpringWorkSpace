package com.test;

import java.io.File;
import java.net.MalformedURLException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.pojo.Student;
import com.spring.SpringUtils;

/**
 * 由于Spring就是通过IOC容器来帮助我们 生成一个对象，而不是我们自己new 一个对象，从而降低了耦合度
 * @author SiVan
 *
 */
public class Test {
	
	public static void main(String[] args) throws MalformedURLException, DocumentException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Student student  = (Student) SpringUtils.read("student");
		student.setStuId(1);
		System.out.println(student.getStuId());
		
	}

}
