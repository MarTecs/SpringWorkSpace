package com.itheima.demo3;

import org.apache.log4j.Logger;
import org.junit.Test;

public class UserService {
	
	Logger log = Logger.getLogger(UserService.class);
	
	public void init() {
		System.out.println("�����˳�ʼ������");
	}
	
	public void service() {
		log.info("�����˷��񷽷�");
	}
	
	public void destroy() {
		
		System.out.println("���������ٷ���");
		
	}

}
