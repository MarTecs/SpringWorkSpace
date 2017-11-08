package com.itheima.demo4;

public class Car {
	
	private String name;
	private double price;
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	
	public String hello() {
		return "hello";
	}
	
	
	
	

}
