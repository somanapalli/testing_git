package com.techm.cfw;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getStname().compareTo(o2.getStname());
		
	}

}
