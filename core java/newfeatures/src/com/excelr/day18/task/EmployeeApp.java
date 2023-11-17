package com.excelr.day18.task;

import java.util.ArrayList;
import java.util.List;

import com.excelr.day17.functionalinterface.Employee;

public class EmployeeApp {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();

		
		employees.add(new Employee(1, "ankit", "hr", 67000, 34));
		employees.add(new Employee(23, "rahul", "developer", 72000, 25));
		employees.add(new Employee(3, "manoj", "developer", 83000, 27));
		employees.add(new Employee(7, "shubam", "hr", 81000, 32));
		employees.add(new Employee(5, "mohit", "tester", 75000, 30));
		
		
		EmployeeImplementation employeeImplementation = new EmployeeImplementation();
		long countOfEmp = employeeImplementation.countOfAllEmployee(employees);
		System.out.println("count " + countOfEmp);
		
		System.out.println("------");
		
	  List<Employee> employees2=	employeeImplementation.displayOnlyHr(employees);
	  employees2.forEach(System.out::println);
		
	}

}
