package com.excelr.day22;

class Engagement extends Thread
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
			System.out.println("Engagement :"+ i);
		}
	}
}
class Marriage extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Marriage :"+ i);
		}
	}
}

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {

		Engagement engagement = new Engagement();
		Marriage marriage = new Marriage();
		
		engagement.start();
		engagement.join();
		
		marriage.start();
		
	}

}
