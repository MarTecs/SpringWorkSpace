package com.itheima.demo6;

public class UserService {
	
	
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void add() {
		userDao.add();
		System.out.println("service");
	}
	
	
	

}
