package com.techm.cfw;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test3 {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(304);
		al.add(89);
		al.add(76);
		al.add(987);
		
		
		ListIterator<Integer> ltr = al.listIterator();
		
		
		while(ltr.hasNext())
		{
			Integer i = ltr.next();
			
			
			if(i%2==0)
				System.out.println(i);
		}
		
		
		
		
		
		
		
		
	}

}
