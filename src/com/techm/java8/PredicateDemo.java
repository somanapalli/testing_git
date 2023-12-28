package com.techm.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	
	
	public static void main(String[] args) {
		
		Predicate<Integer> predicate =t -> t%2==0;
		
		//System.out.println(predicate.test(53));
		
		List<Integer> list1 = Arrays.asList(23,44,55,66,77,88);
		
		list1.stream().filter(t->t%2==0).forEach(t->System.out.println("printing even integers are:" +t));
	}

}
