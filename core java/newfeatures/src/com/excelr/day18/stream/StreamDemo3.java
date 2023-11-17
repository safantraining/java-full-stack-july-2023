package com.excelr.day18.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.excelr.day17.functionalinterface.Employee;

public class StreamDemo3 {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "ankit", "hr", 67000, 34));
		employees.add(new Employee(23, "rahul", "developer", 72000, 25));
		employees.add(new Employee(3, "manoj", "developer", 83000, 27));
		employees.add(new Employee(7, "shubam", "hr", 81000, 32));
		employees.add(new Employee(5, "mohit", "tester", 75000, 30));

		System.out.println("---sorting the employee by age ascending----");
		employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);

		System.out.println("---sorting the employee by age in descending----");
		employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).forEach(System.out::println);

		System.out.println("sorting by name");
		employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
	
		System.out.println("age greather than 25");
	List<Employee> emp=   employees.stream().filter(e->e.getAge()>25).collect(Collectors.toList());
	emp.forEach(System.out::println);
	
	
	}

}
