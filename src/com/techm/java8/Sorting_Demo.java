package com.techm.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sorting_Demo {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(3);
		list.add(12);
		list.add(4);
		
		/*
		 * Collections.sort(list); 
		 * System.out.println(list); 
		 * Collections.reverse(list);
		 * System.out.println(list);
		 */
		
		//list.stream().sorted().forEach(obj->System.out.println(obj));
		
		//list.stream().sorted((o1,o2)->o2.compareTo(o1)).forEach(obj->System.out.println(obj));
		//list.stream().sorted(Comparator.reverseOrder()).forEach(obj->System.out.println(obj));
		
		List<Employee> list_employees = DataBase.getEmployees();
		//list_employees.stream().sorted((o1,o2)->o2.getSalary().compareTo(o1.getSalary())).forEach(obj->System.out.println(obj));
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);
		
		
		
		
		
		List<Entry<String,Integer>> list2 = new ArrayList(map.entrySet());
		//Collections.sort(list2, (o1,o2)->o1.getValue().compareTo(o2.getValue()));
		//list2.stream().forEach(obj->System.out.println(obj));
		
		
		
		
		
		//map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(obj->System.out.println(obj));
		
		Map<Employee,Integer> map1 = new HashMap<>();
		map1.put(new Employee(176, "Roshan", "IT", 600000), 60);
		map1.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
		map1.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
		map1.put(new Employee(624, "Sourav", "CORE", 400000), 40);
		map1.put(new Employee(176, "Prakash", "SOCIAL", 1200000), 120);
		
		map1.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed())).forEach(obj->System.out.println(obj));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
