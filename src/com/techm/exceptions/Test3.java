package com.techm.exceptions;

import java.util.InputMismatchException;

public class Test3 {
	
	//called method or function 
	
	public void division(int x, int y) throws ArithmeticException,InputMismatchException
	{
		int z = x/y;
		System.out.println("division of given two no's is: " + (x/y));
	}

}
