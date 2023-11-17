package com.excelr.day4.oops.employeeapp;

public class EmployeeApp {

	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeService();
		
		Employee employee = new Employee(1, "sachin", 20, 85000, "hr");
		
		employeeService.displayEmployeeInfo(employee);
		
		int perDaySalary = employeeService.calculatePerDaySalary(employee);
		System.out.println("perday salary :"+ perDaySalary);
		
		int salaryEarned = employeeService.totalSalaryEarned(employee);
		System.out.println("total salary earned :"+ salaryEarned);
		
		
	}

}
