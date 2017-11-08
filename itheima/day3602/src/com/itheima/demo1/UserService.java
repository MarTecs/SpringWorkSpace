package com.itheima.demo1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value="userService")
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	@Qualifier(value="userDao")
	private UserDao userDao2;
	
	@Resource(name="userDao")
	private UserDao userDao3;
	
	public void service() {
		userDao.save();
		userDao2.save2();
		userDao3.save3();
		System.out.println("�չ�");
	}
	
	//�������ڳ�ʼ������ ������init-method
	@PostConstruct
	public void init() {
		System.out.println("��ʼ��");
	}
	
	//�������ڵĽ��������������� destroy-method
	@PreDestroy
	public void destroy() {
		System.out.println("����");
		
	}
	

}
