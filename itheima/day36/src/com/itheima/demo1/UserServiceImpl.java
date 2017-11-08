package com.itheima.demo1;

import org.springframework.stereotype.Component;


//@Component 如果这样写，默认id为 将类名第1个字母小写, 也就是 @Component(value="userServiceImpl")
@Component(value="us")
public class UserServiceImpl implements UserService{

	@Override
	public void add() {
		System.out.println("添加成功");
	}

}
