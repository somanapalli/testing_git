package com.techm.multithreading;

public class Test3 {
	
	public static void main(String[] args) {
		
		Table obj = new Table();
		Test1 t1 = new Test1(obj);
		Test2 t2 = new Test2(obj);
		t1.start();
		t2.start();
	}

}
