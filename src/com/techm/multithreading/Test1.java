package com.techm.multithreading;

public class Test1 extends Thread{
	
	Table t;
	Test1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
	

}
