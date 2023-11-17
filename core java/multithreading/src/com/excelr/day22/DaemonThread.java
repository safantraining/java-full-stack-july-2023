package com.excelr.day22;

class Maid extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Maid "+ i);
		}
	}
}

class Owner extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Owner "+ i);
		}
	}
}

public class DaemonThread {

	public static void main(String[] args) {

		Maid maid = new Maid();
		Owner owner = new Owner();
		
		maid.setDaemon(true);

		maid.start();
		
		owner.start();
		
	}

}
