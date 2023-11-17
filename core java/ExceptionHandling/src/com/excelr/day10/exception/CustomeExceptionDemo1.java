package com.excelr.day10.exception;

class InValidAgeException extends Exception
{
  private String msg;
  
	public InValidAgeException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

}

class User
{
	public void checkEligiblity(int age) throws InValidAgeException
	{
		if(age>=18)
			System.out.println("you are eligible to vote");
		else
			throw new InValidAgeException("not eligible, your age is less");
	}
}


public class CustomeExceptionDemo1 {

	public static void main(String[] args) {

		
		User user = new User();
		try
		{
			user.checkEligiblity(2);
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
	}

}
