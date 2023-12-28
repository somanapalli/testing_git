package com.techm.cfw;

import java.util.LinkedList;
import java.util.List;

public class Test1 {

	
	public static void main(String[] args) {
		
		//create the object for List interface 
		
		List l = new LinkedList();
		
		System.out.println(l.size());//0
		
		//add the element 
		l.add(Integer.valueOf(100));
		l.add(null);
		l.add(Boolean.valueOf(true));
		l.add(Integer.valueOf(100));
		l.add(new String("rama"));
		
		System.out.println(l);//[100, null, true, 100, rama]
		
        boolean b = l.remove("rama");
        
        System.out.println(l);//[100, null, true, 100]
        
        
        l.remove(Integer.valueOf(100));
       
        System.out.println(l);//[null, true, 100]
        System.out.println(l.remove(2));//100
        
        System.out.println(l);//[null, true]
        
        
        System.out.println(l.isEmpty());
       
        System.out.println(l.contains(null));//true
        
        l.clear();
        
        System.out.println(l);//[]
        
        l.add("ram");
        l.add(Integer.valueOf(100));
        l.add(true);
        
        System.out.println(l);
        
        l.add(1, Double.valueOf(2.3));
        
        System.out.println(l);
        
        //foreach method on this list object 
        
        for(Object o:l) {
        	System.out.println(o);
        }
        
	
	}
}
