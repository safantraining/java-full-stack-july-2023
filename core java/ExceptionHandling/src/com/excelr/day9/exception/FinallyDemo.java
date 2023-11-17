package com.excelr.day9.exception;

public class FinallyDemo {

	public static void main(String[] args) {

		try
		{
			System.out.println(2/2);
		}
		catch (Exception e)  // It will call only, when there is a exception
		{
			System.out.println("catch called");
		}
		finally  //It will call always, the code will execute guranteedly.
		{
			System.out.println("finally called");
		}
	}

}
