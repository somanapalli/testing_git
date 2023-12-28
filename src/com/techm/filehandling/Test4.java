package com.techm.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test4 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ser.txt"));
	
		Student st1 = new Student(100,"safia");
		
	    oos.writeObject(st1);
	    
	    System.out.println("serialization process has done");
	
	}

}
