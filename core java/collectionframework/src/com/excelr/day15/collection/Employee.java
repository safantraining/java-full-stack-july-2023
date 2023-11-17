package com.excelr.day15.collection;

public class Employee {

	private int id;
	private String name;
	private String dept;
	private int salary;
	private int age;
	
	
	public Employee() {
		super();
	}


	public Employee(int id, String name, String dept, int salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.age = age;
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


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", age=" + age + "]";
	}
	
	
}
