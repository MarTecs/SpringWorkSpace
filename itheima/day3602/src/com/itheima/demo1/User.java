package com.itheima.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="user")
@Scope(value="singleton")		//���õ���ģʽ��ע��
//@Scope(value="prototype")		//���ö���ģʽ��ע��
public class User {
	
	//���ʹ��ע����д������Ҫ�ṩ���Ե�set����
	@Value(value="������")
	private String name;
	

}
