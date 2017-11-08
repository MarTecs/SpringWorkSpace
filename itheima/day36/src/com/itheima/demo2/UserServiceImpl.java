package com.itheima.demo2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component(value="userService")
public class UserServiceImpl implements UserService{
	
	
	//���ڻ������͵�ע�⣬ʹ������
	@Value(value="������")
	private String name;
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public String toString() {
		return "UserServiceImpl [name=" + name +  "]";
	}

	@Override
	public void service() {
		userDao.add();
		System.out.println("service");
		System.out.println(toString());
	}

}
