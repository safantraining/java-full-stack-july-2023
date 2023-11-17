package com.excelr.day22;

class Task2 implements Runnable  // It has only run method
{
    @Override
	public void run() {
		System.out.println("this is run method");
	}
	
}

public class ByImplementatingRunnableInterface {

	public static void main(String[] args) {

		Task2 task2 = new Task2();
		
		Thread thread = new Thread(task2);
		thread.start();
	}

}
