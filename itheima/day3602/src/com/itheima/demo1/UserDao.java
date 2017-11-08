package com.itheima.demo1;

import org.springframework.stereotype.Repository;

@Repository(value="userDao")
public class UserDao {
	
	public void save() {
		System.out.println("±£´æ");
	}
	
	public void save2() {
		System.out.println("±£´æ2");
	}
	
	public void save3() {
		System.out.println("±£´æ3");
	}

}
