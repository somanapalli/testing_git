package com.techm.exceptions;

public class Test2 {
	
	//instance block
	{
		System.out.println("instance block");
	}
	//static block
	static
	{
		System.out.println("static block");
	}
	public Test2()
	{
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		Test2 obj = new Test2();
		
		
	}

}
/*output order
 * 
 * static block
   instance block
   constructor
 */
