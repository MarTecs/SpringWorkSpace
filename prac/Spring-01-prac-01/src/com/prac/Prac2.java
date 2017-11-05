package com.prac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Student;

/**
 * �����ļ���ʹ��set�������и�ֵ
 * @author SiVan
 *
 */
public class Prac2 {

	public static void main(String[] args) {
		
		//��ȡ�������ļ�
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student.getStuId());
		System.out.println(student.getStuName());
		
		
		
	}
}
