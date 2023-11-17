package com.excelr.day22;

class Sachin extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++) 
		{
			System.out.println(Thread.currentThread().getName() +" "+ i);
		}
		
	}
}

class Rahul extends Thread
{
	public void run()
	{
		for(int i=10;i<=20;i++) 
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		
	}
}

class Ankit extends Thread
{
	public void run()
	{
		for(int i=20;i<=25;i++) 
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		
	}
}

public class ThreadNamingDemo {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());

		Sachin sachin = new Sachin();
		Rahul rahul = new Rahul();
		Ankit ankit = new Ankit();
		
		sachin.setName("sachin");
		rahul.setName("rahul");
		ankit.setName("ankit");
		
		sachin.setPriority(1);
		rahul.setPriority(10);
		ankit.setPriority(6);
		
		sachin.start();
		rahul.start();
		ankit.start();
	}

}
