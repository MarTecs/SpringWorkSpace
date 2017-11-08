package com.itheima.demo3;

import org.apache.log4j.Logger;
import org.junit.Test;

public class UserService {
	
	Logger log = Logger.getLogger(UserService.class);
	
	public void init() {
		System.out.println("调用了初始化方法");
	}
	
	public void service() {
		log.info("调用了服务方法");
	}
	
	public void destroy() {
		
		System.out.println("调用了销毁方法");
		
	}

}
