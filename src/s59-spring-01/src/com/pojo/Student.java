package com.pojo;

import java.util.Map;

public class Student {

	private int stuid;
	private String stuname;
	private String[] loves;
	private Map others ;

	public Map getOthers() {
		return others;
	}

	public void setOthers(Map others) {
		this.others = others;
	}

	public String[] getLoves() {
		return loves;
	}

	public void setLoves(String[] loves) {
		this.loves = loves;
	}

	public int getStuid() {
		return stuid;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

}