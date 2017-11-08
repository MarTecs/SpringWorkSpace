package com.itheima.demo2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value="userDao")
public class UserDao {
	
	
	//��������������������@AutoWiredע�⣬���Ậ����Σ�����Ҳ��֪���ᵼ���ĸ�����˿��Բ����������
	//1. @AutoWired
	//	 @Qualifier(value="userDao")			����һ��ʹ��
	//2. ����Java�е�ע�� @Resource(name="userDao")
	private UserService user;
	
	public void add() {
		System.out.println("����û�");
		user.service();
	}
	
	@PostConstruct//�൱��init-method
	public void init() {
		
	}
	
	@PreDestroy//�൱��destroy-method
	public void destroy() {
		
	}
	

}
