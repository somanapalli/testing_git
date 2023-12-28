package com.techm.cfw;

import java.util.TreeSet;

public class Test5 {

	
	public static void main(String[] args) {
		
		TreeSet<Student> ts = new TreeSet<Student>(new MyComparator());
		
		
		Student st2 = new Student(10,"girija");
		Student st3 = new Student(102,"swaroop");
		Student st1 = new Student(76,"chanda");
		
		ts.add(st1);
		ts.add(st2);
		ts.add(st3);
		
		System.out.println(ts);
		
		
	}
}
