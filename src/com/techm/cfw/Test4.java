package com.techm.cfw;

import java.util.HashSet;

public class Test4 {

	
	public static void main(String[] args) {
		
		HashSet<Student> al = new HashSet<Student>();
		
		Student st1 = new Student(100,"swaroop");
		Student st2 = new Student(101,"Chanda");
		Student st3 = new Student(100,"swaroop");
		
		al.add(st1);
		al.add(st2);
		al.add(st3);
		System.out.println(al);
		
	}
}
