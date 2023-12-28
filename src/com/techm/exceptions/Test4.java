package com.techm.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test4 {
	
	//calling function or method 
	public static void main(String[] args) {
		try {
		Scanner s = new Scanner(System.in);
		System.out.println("enter first number:");
		int fno = s.nextInt();
		System.out.println("enter second number:");
		int sno = s.nextInt();
		
		Test3 obj  = new Test3();
		
		
		obj.division(fno, sno);
		}
		catch(RuntimeException re) {
			if(re instanceof ArithmeticException)
				System.out.println("dont enter zero as denominator");
			if(re instanceof InputMismatchException)
				System.out.println("please pass only numeric values");
		}
	}

}
