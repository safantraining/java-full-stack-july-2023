package com.excelr.day10.exception;

class LateException extends Exception
{
	String errorMessage;

	public LateException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}

class Student
{
	  public void loginTime(int time) throws LateException
	  {
		  if(time<9)
			  System.out.println("you are present");
		  else
			  throw new LateException("you are absent");
	  }
}


public class CustomeExceptionDemo2 {

	public static void main(String[] args) {

		Student student = new Student();
		
		try
		{
			student.loginTime(10);
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
	}

}
