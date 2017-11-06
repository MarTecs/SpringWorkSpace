package com.itheima.demo2;

import org.apache.log4j.Logger;

public class UserServiceImpl implements UserService{

	@Override
	public void sayHello() {
		Logger logger = Logger.getLogger(UserServiceImpl.class);
		logger.info("say Hello");
		System.out.println("say Hello");
	}

}
