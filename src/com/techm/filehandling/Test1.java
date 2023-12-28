package com.techm.filehandling;

import java.io.File;
import java.io.IOException;

public class Test1 {
	
	public static void main(String[] args) {
		
		//create the File class object 
		
		File f = new File("rk.txt");
		try {
		f.createNewFile();
		}
		catch(IOException ioe) {
			System.out.println(ioe);
		}
		
		System.out.println(f.exists());
		
	}

}
