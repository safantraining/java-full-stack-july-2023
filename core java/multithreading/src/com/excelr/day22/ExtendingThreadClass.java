package com.excelr.day22;

class Task1 extends Thread  // run, start,stop,etc
{
	public void run()
	{
		System.out.println("this is run method,It is called by start method");
	}
}


public class ExtendingThreadClass {

	public static void main(String[] args) {

		Task1 task1 = new Task1();
		task1.start();
		
		
	}

}
