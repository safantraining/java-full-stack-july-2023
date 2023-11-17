package com.excelr.day22;

class Customer
{
	int balance=5000;
	
	
	synchronized  void withdraw(int amount)
	{
		System.out.println("going to withdraw");
		
		if(balance<amount)
		{
			try {
				System.out.println("less balance, waiting to deposit");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		balance-=amount;
		System.out.println("withdraw completed");
	}
	
	
	
    synchronized public void deposit(int amount)
	{
		System.out.println("going to deposit");
		balance+=amount;
		System.out.println("deposit completed");
		notify();
	}
	
}



public class InterThreadCommunication {

	public static void main(String[] args) {

	final Customer customer = new Customer();
		
		Thread t1 = new Thread()
		{
			  public void run()
			  {
				  customer.withdraw(8000);
			  }
	    };
		
	    Thread t2 = new Thread()
	    {
	    	public void run()
	    	{
	    		customer.deposit(5000);
	    	}
	    	
	    };
	    

	    
	    t1.start();
	    t2.start();
		
		
	}

}
