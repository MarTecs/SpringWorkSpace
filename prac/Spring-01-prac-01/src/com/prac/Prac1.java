package com.prac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Student;

/**
 * ��ȡ����֮�����ǽ����ֶ���ֵ
 * @author SiVan
 *
 */
public class Prac1 {
	
	
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//ֱ�ӻ�ȡSpring�������ɵ�Student����
		Student student = (Student) context.getBean("student");
		student.setStuId(1);
		System.out.println(student.getStuId());
		
		
		
	}

}
