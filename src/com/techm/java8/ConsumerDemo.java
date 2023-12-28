package com.techm.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo  {


	public static void main(String[] args) {
		
		/*Consumer<Integer> consumer = r->System.out.println("printing:" + r);
		consumer.accept(56);*/
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		list1.stream().forEach(t->System.out.println("printing: " + t));
		
		
	}
}
