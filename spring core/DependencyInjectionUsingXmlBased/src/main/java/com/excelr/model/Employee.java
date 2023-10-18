package com.excelr.model;

public class Employee {

	String message;
	
	Department department;
	
	
   public void setDepartment(Department department) {
		this.department = department;
	}


    public void setMessage(String message) {
		this.message = message;
	}



public	void display()
	{
		System.out.println("this is display method in employee class");
		System.out.println("MSG :"+ message);
		department.deptInfo();
	}

}
