package com.techm.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_ForEach_Filter_Demo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("murthy");
		list.add("jagan");
		list.add("pavan");
		list.add("mohan");
		list.add("madhu");

		/*
		 * for (String s : list) { 
		 * if(s.startsWith("m")) 
		 * System.out.println(s); 
		 * }
		 */
		// list.stream().forEach(t->System.out.println(t));

		//list.stream().filter(t -> t.startsWith("m")).forEach(t -> System.out.println(t));

		Map<Integer,String> map = new HashMap<>();
		map.put(100, "rama");
		map.put(78, "ankush");
		map.put(55, "rohith");
		map.put(67, "twinkle");
		
		//map.forEach((key,value)->System.out.println(key +  "-->" + value));
		
		//map.entrySet().stream().forEach(obj->System.out.println(obj));
		
		//map.entrySet().stream().filter(obj->obj.getKey()%2==0).forEach(obj->System.out.println(obj));
	
	    List<Employee> list2 = DataBase.getEmployees();
		
		//list2.stream().forEach(obj->System.out.println(obj));
		
		List<Employee> list3_tax_emp=list2.stream().filter(obj->obj.getSalary()>500000).collect(Collectors.toList());
		
		System.out.println(list3_tax_emp);
		
		System.out.println("=========================");
		List<Employee> list4_nontax_emp=list2.stream().filter(obj->obj.getSalary()<=500000).collect(Collectors.toList());
		
		System.out.println(list4_nontax_emp);
		
		
		
	
	}

}
