package com.techm.cfw;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test6 {
	
	public static void main(String[] args) {
		
		//create the obejct for Map 
		Map<Integer,String> m= new LinkedHashMap<Integer,String>();
		
		//add the pair(key,value) 
		
		m.put(100, "chanda");
		m.put(78, "anushka");
		m.put(65, "swaroop");
		m.put(567, "rk");
		m.put(null, null);
		m.put(100, "safia");
		m.put(230, "safia");
		
		System.out.println(m);
		
		m.replace(230, "jahnavi");
		
		System.out.println(m);
		
		m.remove(null);
		System.out.println(m);
		
		System.out.println(m.get(567));
		
		Set<Entry<Integer,String>> s = m.entrySet();
		System.out.println(s);
		
		Iterator<Entry<Integer,String>> itr = s.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("===================");
		for(Map.Entry<Integer,String> me:m.entrySet())
		{
			System.out.println(me.getKey() +  " " + me.getValue());
		}
		
	}

}
