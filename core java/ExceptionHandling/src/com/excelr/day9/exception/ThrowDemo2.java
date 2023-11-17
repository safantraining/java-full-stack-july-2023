package com.excelr.day9.exception;


class User
{
	 public void checkEligiblity(int age)
	 {
		 if(age>=18)
			 System.out.println("eligible to vote");
		 else
			throw new ArithmeticException("not eligible");
	 }
}

public class ThrowDemo2 {

	public static void main(String[] args) {

		User user = new User();
		
		try
		{
			user.checkEligiblity(3);

		}
		catch (ArithmeticException e) 
		{
			System.out.println(e.getMessage());
		}
		
	}

}
