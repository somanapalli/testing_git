package com.techm.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		try {
			// problematic statements
			Scanner s = new Scanner(System.in);
			System.out.println("enter first number");
			int fno = s.nextInt();
			System.out.println("enter second number");
			int sno = s.nextInt();

			int division = fno / sno;
			System.out.println("division of given two nos is : " + division);
		}

		catch (RuntimeException re) {
			if (re instanceof ArithmeticException)
				System.out.println("don't enter zero as denominator");
			if (re instanceof InputMismatchException)
				System.out.println("please pass only numeric values");
		}

		finally {
			System.out.println("finally block executed always");
		}

		System.out.println("rest statements also executed");
	}

}

/*
 * 
 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
 * com.techm.exceptions.Test1.main(Test1.java:16)
 * 
 */
