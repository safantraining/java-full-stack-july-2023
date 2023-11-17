package com.excelr.collections;

import java.util.ArrayList;

public class GenericCollection {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<Integer>();
	    nums.add(1);
	    nums.add(2);
	   // nums.add("ravi");
	    
	    ArrayList<String> names = new ArrayList<String>();
	    names.add("sachin");
	    names.add("rahul");
	    
	    ArrayList<Employee> employees = new ArrayList<Employee>();
	    employees.add(new Employee(1, "sunil", "tester", 45000, 23));
	    employees.add(new Employee(2, "ankit", "rahul", 56000, 28));
	
	}

}
