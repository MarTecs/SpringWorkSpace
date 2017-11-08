package com.itheima.demo2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value="userDao")
public class UserDao {
	
	
	//对于这种情况，如果采用@AutoWired注解，将会含糊其次，我们也不知道会导入哪个，因此可以采用如下情况
	//1. @AutoWired
	//	 @Qualifier(value="userDao")			两个一起使用
	//2. 采用Java中的注解 @Resource(name="userDao")
	private UserService user;
	
	public void add() {
		System.out.println("添加用户");
		user.service();
	}
	
	@PostConstruct//相当于init-method
	public void init() {
		
	}
	
	@PreDestroy//相当于destroy-method
	public void destroy() {
		
	}
	

}
