package com.pojo;

import java.util.Map;

public class Student {
	
	private int stuId;
	private String stuName;
	private String[] loves;
	private Map stuMaps;
	
	
	public Student() {
	}


	public int getStuId() {
		return stuId;
	}


	public void setStuId(int stuId) {
		this.stuId = stuId;
	}


	public String getStuName() {
		return stuName;
	}


	public void setStuName(String stuName) {
		this.stuName = stuName;
	}


	public String[] getLoves() {
		return loves;
	}


	public void setLoves(String[] loves) {
		this.loves = loves;
	}


	public Map getStuMaps() {
		return stuMaps;
	}


	public void setStuMaps(Map stuMaps) {
		this.stuMaps = stuMaps;
	}
	
	
	
	

}
