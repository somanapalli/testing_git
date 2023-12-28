package com.techm.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test5 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new 
				ObjectInputStream(new FileInputStream("ser.txt"));
		
		Student stu =(Student) ois.readObject();
		
		System.out.println("student id is: " + stu.getStid());
		System.out.println("student name is: " + stu.getStname());
		
	}

}
