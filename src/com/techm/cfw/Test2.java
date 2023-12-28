package com.techm.cfw;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test2 {
	
	public static void main(String[] args) {
		
		//create the object for Set
		
		Set s = new LinkedHashSet();
		
		s.add("rama");
		s.add(98);
		s.add(true);
		s.add(9.8);
		
		s.add(98);
		s.add(null);
		s.add(null);
		
		System.out.println(s);//[null, 98, rama, 9.8, true]
		
		for(Object o:s) {
			System.out.println(o);
		}
		System.out.println("===========================");
		
		Iterator itr = s.iterator();
	
		while(itr.hasNext())
		{
			Object obj = itr.next();
			
			if(obj instanceof Integer) {
				//from parent to child type (downcasting)
				Integer i = (Integer)obj;
				if(i==98)
				itr.remove();
			}
			
		}
		System.out.println(s);
	}

}
