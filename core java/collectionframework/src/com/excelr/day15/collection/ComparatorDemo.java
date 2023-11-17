package com.excelr.day15.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "ankit", "hr", 56000, 24));
		employees.add(new Employee(6, "rahul", "developer", 92000, 27));
		employees.add(new Employee(2, "shubam", "hr", 70000, 23));
		employees.add(new Employee(5, "kunal", "tester", 65000, 30));

		for(Employee employee : employees)
			System.out.println(employee);
		
		
		System.out.println("---sorting by age----");
		//sorting by age
		Collections.sort(employees, new AgeComparator());
		
		for(Employee employee : employees)
			System.out.println(employee);
		
		
		System.out.println("----sorting by salary----");
		//sorting by salary
		Collections.sort(employees, new SalaryComparator());
				
		for(Employee employee : employees)
			System.out.println(employee);
		
		
		System.out.println("---name sorting-----");
		Collections.sort(employees, new NameSorting());
		
		for(Employee employee : employees)
			System.out.println(employee);
     }

}


class AgeComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getAge()==o2.getAge())
			return 0;
		else if(o1.getAge()>o2.getAge())
			return 1;
		return -1;
	}
	
}

class SalaryComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getSalary()==o2.getSalary())
			return 0;
		else if(o1.getSalary()>o2.getSalary())
			return 1;
		return -1;
	}
	
}

class NameSorting implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
}