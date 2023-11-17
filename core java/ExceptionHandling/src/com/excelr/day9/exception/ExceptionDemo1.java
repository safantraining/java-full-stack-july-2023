package com.excelr.day9.exception;

public class ExceptionDemo1 {

	public static void main(String[] args) {

		System.out.println("get up");
		try
		{
			System.out.println(2/0);
			System.out.println("drink tea");
		}
		catch (Exception e) 
		{
			System.out.println("exception occured");
		}
		
		System.out.println("breakfast");
		System.out.println("lunch");
		System.out.println("dinner");
		System.out.println("sleep");
		
	}

}
