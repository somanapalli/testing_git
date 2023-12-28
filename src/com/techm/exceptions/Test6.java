package com.techm.exceptions;
//business logic class 

public class Test6 {
	
	
	public void checkProduct(int weight)
	{
		if(weight>100)
			System.out.println("product is valid");
		else
			try {
			throw new InvalidProductException("product weight should be greater than 100");
			}
		catch(InvalidProductException ip)
		{
			System.out.println(ip);
		}
	
	}

}
