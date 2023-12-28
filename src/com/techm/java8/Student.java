package com.techm.java8;

import java.util.Objects;

public class Student {

	@Override
	public int hashCode() {
		return Objects.hash(stid, stname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return stid == other.stid && Objects.equals(stname, other.stname);
	}
	private Integer stid;
	private String stname;
	
	public Student(int stid, String stname) {
		super();
		this.stid = stid;
		this.stname = stname;
	}
	
	public Student() {
		super();
	}
	public Integer getStid() {
		return stid;
	}
	public void setStid(Integer stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public String toString()
	{
		return stid + " " +stname;
	}

	
	
}
