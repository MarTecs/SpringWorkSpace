package com.itheima.demo1;

import org.springframework.stereotype.Component;


//@Component �������д��Ĭ��idΪ ��������1����ĸСд, Ҳ���� @Component(value="userServiceImpl")
@Component(value="us")
public class UserServiceImpl implements UserService{

	@Override
	public void add() {
		System.out.println("��ӳɹ�");
	}

}
