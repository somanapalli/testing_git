package com.techm.exceptions;

import java.util.Scanner;

//ctrl+shift+o-short cut for organizing the import statements
public class Test5 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter string ");
		String word = s.next();
		
		if(word.startsWith("r")) {
			try {
			throw new ArithmeticException();
			}
		catch(ArithmeticException ae)
		{
			System.out.println("string should not start with r");
		}
		}
		else
		{
			System.out.println(word + " is valid");
		}
		
	}

}
