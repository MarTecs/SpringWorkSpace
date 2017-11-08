package com.itheima.demo5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	private String name;
	private String[] loves;
	private List<Car> cars;
	private Map maps;
	private Properties props;
	public void setName(String name) {
		this.name = name;
	}
	public void setLoves(String[] loves) {
		this.loves = loves;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	public void setMaps(Map maps) {
		this.maps = maps;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", loves=" + Arrays.toString(loves) + ", cars=" + cars + ", maps=" + maps
				+ ", props=" + props + "]";
	}
	
	

}
