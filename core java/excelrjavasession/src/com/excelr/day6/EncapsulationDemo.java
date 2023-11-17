package com.excelr.day6;

class Employee2
{
 private int id;
 private String name;
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
 
 
 
 
}

public class EncapsulationDemo {

	public static void main(String[] args) {

		Employee2 employee2 = new Employee2();
		employee2.setId(1);
		employee2.setName("sachin");
		
		System.out.println(employee2.getId());
		System.out.println(employee2.getName());
		
	}

}
