package com.techm.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo{

	
	
	public static void main(String[] args) {
		
		Supplier<String> supplier =()->"welcome to techm" ;
		//System.out.println(supplier.get());
		
		List<String> list1 = Arrays.asList();
		System.out.println(list1.stream().findAny().orElseGet(()-> "welcome to techm"));
	}

}
