package com.excelr.day4.oops;

class Employee
{
	//variable
	int id;
	String name;
	int noOfDayPresent;
	int salary;
	
	void displayEmployeeInfo()
	{
		System.out.println("----employee info--------");
		System.out.println("id :"+ id);
		System.out.println("name :"+ name);
		System.out.println("noofdaypresent :"+ noOfDayPresent);
		System.out.println("salary :"+ salary);
		
	}
	
	void perDaySalary()
	{
		System.out.println("perday salary of employee : "+(salary/30));
	}
	
}



public class EmployeeApp {

	public static void main(String[] args) {

		Employee  employee = new Employee();
		employee.id=1;
		employee.name="manish";
		employee.salary=67000;
		employee.noOfDayPresent=20;
		
		Employee  employee2 = new Employee();
		employee2.id=2;
		employee2.name="sourab";
		employee2.salary=40000;
		employee2.noOfDayPresent=21;
		
		employee.displayEmployeeInfo();
		employee.perDaySalary();
		
		employee2.displayEmployeeInfo();
		employee2.perDaySalary();
		
		
	}

}
