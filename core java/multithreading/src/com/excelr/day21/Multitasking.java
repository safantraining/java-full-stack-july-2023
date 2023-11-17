package com.excelr.day21;

class Anushree extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("===Anushree=== :"+ i);
		}
	}
}

class Shubani extends Thread
{
	public void run()
	{
		for(int i=11;i<=20;i++)
		{
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("***Shubani*** :"+ i);
		}
	}
}

class Naaz extends Thread
{
	public void run()
	{
		for(int i=21;i<=30;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("!!!Naaz!!! :"+ i);
		}
	}
}

public class Multitasking {

	public static void main(String[] args) {
		
		Anushree anushree = new Anushree();
		Shubani shubani = new Shubani();
		Naaz naaz = new Naaz();
		
		// sequential execution
		//anushree.run();
		//shubani.run();
		//naaz.run();
		
		//parallel execution
		anushree.start();
		shubani.start();
		naaz.start();
	}
}
