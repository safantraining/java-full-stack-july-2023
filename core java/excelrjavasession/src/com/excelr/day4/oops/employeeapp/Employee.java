package com.excelr.day4.oops.employeeapp;

public class Employee {

	int id;
	String name;
	int noOfDaysPersent;
	int salary;
	String dept;
	
	public Employee(int id, String name, int noOfDaysPersent, int salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.noOfDaysPersent = noOfDaysPersent;
		this.salary = salary;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", noOfDaysPersent=" + noOfDaysPersent + ", salary=" + salary
				+ ", dept=" + dept + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfDaysPersent() {
		return noOfDaysPersent;
	}

	public void setNoOfDaysPersent(int noOfDaysPersent) {
		this.noOfDaysPersent = noOfDaysPersent;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	

}
