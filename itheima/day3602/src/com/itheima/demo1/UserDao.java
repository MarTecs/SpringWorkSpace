package com.itheima.demo1;

import org.springframework.stereotype.Repository;

@Repository(value="userDao")
public class UserDao {
	
	public void save() {
		System.out.println("����");
	}
	
	public void save2() {
		System.out.println("����2");
	}
	
	public void save3() {
		System.out.println("����3");
	}

}
