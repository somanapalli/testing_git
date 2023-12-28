package com.techm.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test3 {
	
	public static void main(String[] args) {
		try {
		//create the object for BufferedReader
		
		BufferedReader br = new BufferedReader(new FileReader("rk.txt"));
		String word = br.readLine();
		
		while(word!=null)
		{
			System.out.println(word);
			word = br.readLine();
		}
		}
		catch(FileNotFoundException fnf) {
			System.out.println(fnf);
		}
		catch(IOException ioe) {
			System.out.println(ioe);
		}
	
	}


}
