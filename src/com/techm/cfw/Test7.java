package com.techm.cfw;

import java.util.TreeMap;

public class Test7 {
	
	public static void main(String[] args) {
		
		TreeMap<Student,String> tm = new TreeMap<Student,String>(new MyComparator());
		
		Student st1 = new Student(100,"Rama");
		Student st2 = new Student(89,"Techm");
		
		tm.put(st1, "anushka");
		tm.put(st2, "ankush");
		
		
		System.out.println(tm);
	}

}
