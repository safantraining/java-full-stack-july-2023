package com.excelr.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="emp70")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int salary;
	private int age;
	
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int salary, int age, Dept dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.dept = dept;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "deptid", referencedColumnName = "id")
	private Dept dept;

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

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", dept=" + dept + "]";
	}
	
	
	
	
	
	
}
