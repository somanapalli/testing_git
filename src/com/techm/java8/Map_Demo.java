package com.techm.java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Map_Demo {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);
		
		//map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(obj->System.out.println(obj));
		//map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(obj->System.out.println(obj));
	
		
		Map<Employee,Integer> map1 = new HashMap<>();
		map1.put(new Employee(176, "Roshan", "IT", 600000), 60);
		map1.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
		map1.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
		map1.put(new Employee(624, "Sourav", "CORE", 400000), 40);
		map1.put(new Employee(176, "Prakash", "SOCIAL", 1200000), 120);
		
		
		map1.entrySet().stream().sorted(Map.Entry.comparingByKey((o1,o2)->o2.getName().compareTo(o1.getName()))).forEach(obj->System.out.println(obj));
		
	}

}
