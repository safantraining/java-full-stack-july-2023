package com.excelr.day7.oops.inheritance;

import java.util.ArrayList;

import com.excelr.day4.oops.employeeapp.Employee;

public class Task {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "sourab", 23, 56000, "hr"));
		employees.add(new Employee(2, "manish", 32, 56000, "developer"));
		employees.add(new Employee(3, "ankit", 31, 65000, "hr"));
		employees.add(new Employee(4, "rohit", 26, 65000, "developer"));
		
		
		
		for(Employee employee : employees)
		{
			 if(employee.getId()>2)
			       System.out.println(employee);
		}
		
		System.out.println(employees);
		
		
		System.out.println("  from 8");
		
		employees.forEach(System.out::println);
		
		System.out.println("filter employee by hr");
		employees.stream().filter(e-> e.getDept().equals("hr")).forEach(System.out::println);
		
		


	}

}
