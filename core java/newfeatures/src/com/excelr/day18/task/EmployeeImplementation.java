package com.excelr.day18.task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.excelr.day17.functionalinterface.Employee;

public class EmployeeImplementation {

	
	public List<Employee> displayOnlyHr(ArrayList<Employee> employees)
	{
	
		return employees.stream().filter(e->e.getDept().equals("hr")).collect(Collectors.toList());
	}
	
	public long countOfAllEmployee(ArrayList<Employee> employees)
	{
	
		return employees.stream().count();
	}
	
	
}
