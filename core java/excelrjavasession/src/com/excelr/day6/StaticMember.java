package com.excelr.day6;

class Employee
{
	static String dept="cse";
	        String name;
	
	static void displayMessage()
	{
		System.out.println("welocme all..");
	}
	
	void greet()
	{
		System.out.println("this is greet");
	}
	
	
}



public class StaticMember {

	public static void main(String[] args) {

	    System.out.println(Employee.dept);
	     Employee.displayMessage();
	    
	    Employee emp = new Employee();
	    emp.name="sachin";
	    System.out.println(emp.name);
	    
	    emp.greet();
	    
	}

}
