package com.techm.exceptions;

import java.util.Scanner;

public class Test7 {
	
	public static void main(String[] args) {
		
		Test6 obj = new Test6();
		Scanner s = new Scanner(System.in);
		System.out.println("enter product weight");
		int productWeight = s.nextInt();
		obj.checkProduct(productWeight);
		
	}

}
