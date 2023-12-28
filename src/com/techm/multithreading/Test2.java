package com.techm.multithreading;

public class Test2  extends Thread
{
	Table t;
	public Test2(Table t)
	{
		this.t=t;
	}
  public void run()
  {
	  
	 t.printTable(6);
  }
  
}
