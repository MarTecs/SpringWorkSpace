package com.itheima.demo4;

public class Person {
	
	private String name;
	private Car car;
	private String price;
	
	
	public void setPrice(String price) {
		this.price = price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + car + ", price=" + price + "]";
	}
	
}
