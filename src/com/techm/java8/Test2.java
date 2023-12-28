package com.techm.java8;

import java.util.TreeSet;

public class Test2 {
//int compare(T o1, T o2);
	public static void main(String[] args) {
		
		TreeSet<Student> ts = new TreeSet<Student>(
				(o1,o2)->o2.getStname().compareTo(o1.getStname())
				
				);
		Student st1 = new Student(10,"rk");
		Student st2 = new Student(67,"safia");
		Student st3 = new Student(82,"ankush");
		Student st4 = new Student(87,"girija");
		
		ts.add(st1);
		ts.add(st2);
		ts.add(st3);
		ts.add(st4);
		
		System.out.println(ts);
	}
}
