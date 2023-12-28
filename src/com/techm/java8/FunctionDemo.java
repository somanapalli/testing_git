package com.techm.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {


	
	public static void main(String[] args) {
		
		Function<String,String> function =t->t.toUpperCase();
		System.out.println("uppercase string value is: " + function.apply("techm-pune"));
		
		List<String> list1 = Arrays.asList("rk","chanda","jahnavi","twinkle","swaroop");
		list1.stream().map(t->t.toUpperCase()).forEach(t->System.out.println(t));
	}

}
