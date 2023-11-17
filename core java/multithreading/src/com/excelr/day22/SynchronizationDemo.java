package com.excelr.day22;

class Bottle
{
	   void drinkWater(int time)
	  {
		 synchronized (this) 
		 {
			
		 
		  for(int i=1;i<=time;i++)
		  {
			
			System.out.println(Thread.currentThread().getName() +" is drinking "+ i);
		  }
		} 
		for(int i=1;i<=time;i++)
		{
			
			System.out.println(Thread.currentThread().getName() +" is eating"+ i);
		}
		
		
	}
}


class Drinking extends Thread
{
	Bottle bottle = new Bottle();
	
	public void run()
	{
		bottle.drinkWater(5);
	}
}





public class SynchronizationDemo {

	public static void main(String[] args) {

		Drinking drinking = new Drinking();
		
		Thread person1 = new Thread(drinking);	
		Thread person2 = new Thread(drinking);
		
		person1.setName("ravi is drinking");
		person2.setName("sourab is drinking");
		
		person1.start();
		person2.start();
	}

}
