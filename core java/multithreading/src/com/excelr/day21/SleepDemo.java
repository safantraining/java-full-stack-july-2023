package com.excelr.day21;

class Score extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				try
				{
					Thread.sleep(10000);
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
			
			if(i==7)
				stop();
			
			System.out.println("value of i :"+ i);
		}
	}
	
}


public class SleepDemo {

	public static void main(String[] args) {

		Score score = new Score();
		score.start();
	}

}
