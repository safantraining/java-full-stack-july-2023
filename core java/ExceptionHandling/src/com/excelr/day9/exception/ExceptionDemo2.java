package com.excelr.day9.exception;

public class ExceptionDemo2 {

	public static void main(String[] args) {

		System.out.println("start");
		
		int arr[] = new int[5];
		
		try
		{
			//arr[10]=34;
			System.out.println(2/0);
			
		}
		catch (Exception e) 
		{
			//System.out.println("some excepion occured");
			System.out.println(e.getMessage());
		}
		
		System.out.println("end");
	}

}
