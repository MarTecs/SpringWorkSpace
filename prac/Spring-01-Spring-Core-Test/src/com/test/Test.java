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
 * ����Spring����ͨ��IOC�������������� ����һ�����󣬶����������Լ�new һ�����󣬴Ӷ���������϶�
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
