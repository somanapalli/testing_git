package com.techm.filehandling;

import java.io.Serializable;

public class Student implements Serializable {
	
	private transient int stid;
	private String stname;
	
	@Override
	public String toString() {
		return "Student [stid=" + stid + ", stname=" + stname + "]";
	}
	public Student() {
		super();
	}
	public Student(int stid, String stname) {
		super();
		this.stid = stid;
		this.stname = stname;
	}
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	
	
	

}
