package com.itheima.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="user")
@Scope(value="singleton")		//配置单例模式的注解
//@Scope(value="prototype")		//配置多例模式的注解
public class User {
	
	//如果使用注解来写，不需要提供属性的set方法
	@Value(value="吴晓文")
	private String name;
	

}
