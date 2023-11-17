package com.excelr.day17.functionalinterface;

import java.util.ArrayList;

public class StreamDemo2 {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "ankit", "hr", 67000, 34));
		employees.add(new Employee(23, "rahul", "developer", 72000, 25));
		employees.add(new Employee(3, "manoj", "developer", 83000, 27));
		employees.add(new Employee(7, "shubam", "hr", 81000, 32));
		employees.add(new Employee(5, "mohit", "tester", 75000, 30));

		
		employees.stream().forEach(System.out::println);
	
		long count =employees.stream().count();
		System.out.println("number of elements in the stream "+ count);
		
	   long hrCount =	employees.stream().filter(e-> e.getDept().equals("hr")).count();
	   System.out.println("hr count :"+ hrCount);
	   
	   System.out.println("----display only hr----");
	   employees.stream().filter(e->e.getDept().equals("hr")).forEach(System.out::println);
	   
	   System.out.println("----display only developer----");
	   employees.stream().filter(e->e.getDept().equals("developer")).forEach(System.out::println);
	   
	   System.out.println("----map demo [give bonus of 10000 whose salary is 1essthan 80000]---");
	   employees.stream()
	      .filter(e->e.getSalary()<=80000)
	      .map(e-> e.getId() +" "+e.getSalary()+" " +(e.getSalary()+10000))   
	      .forEach(System.out::println);
	   
	   System.out.println("----map demo [increase the salary employee by 10%]---");
	   employees.stream()
	      .map(e-> e.getId() +" "+ e.getName() +" "+e.getSalary()+" " +(e.getSalary()+(e.getSalary()*0.10)))   
	      .forEach(System.out::println);
	   
	   
	   
	}

}
