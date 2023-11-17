package com.excelr.day4.oops.employeeapp;

public class EmployeeService {

	public void displayEmployeeInfo(Employee employee)
	{
		System.out.println("-----employee info----");
		System.out.println("id :"+ employee.id);
		System.out.println("name :"+ employee.name);
		System.out.println("salary "+ employee.salary);
		System.out.println("dept :"+ employee.dept);
		System.out.println("noofDayPresent :"+ employee.noOfDaysPersent);
	}
	
	public int calculatePerDaySalary(Employee employee)
	{
	       return employee.salary/30;
	}
	
	public int totalSalaryEarned(Employee employee)
	{
		return calculatePerDaySalary(employee)*employee.noOfDaysPersent;
	}
	
}
