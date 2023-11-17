package com.excelr.day7.oops.inheritance;

class Address
{
	String streetName;
	String city;
	int pincode;
	public Address(String streetName, String city, int pincode) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.pincode = pincode;
	}
	
	int add(int a,int b)
	{
		return a+b;
	}
}


class Person
{
	int age;
	String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	
}

class Employee extends Person  // is-a extends
{
	String designation;
	Address address;    // has a entity rererence
	
	
    public Employee(int age, String name, String designation, Address address) {
		super(age, name);
		this.designation = designation;
		this.address = address;
	}


      void showEmployeeDetails()
	{
    
		System.out.println("age :"+ age);
		System.out.println("name :"+ name);
		System.out.println("designation :"+ designation);
		System.out.println("street name :"+ address.streetName);
		System.out.println("city :"+ address.city);
		System.out.println("pincode :"+ address.pincode);
		System.out.println("addition :"+ address.add(3, 7));
	}
}


public class IsaHasRelationship {

	public static void main(String[] args) {

		    Address addr = new Address("Btm", "bangalore", 560084);
	  
	        Employee employee = new Employee(25, "john","hr", addr);
	        employee.showEmployeeDetails();
	            
	         System.out.println("===================");
	            
	         Employee employee2 = new Employee(31, "sourab", "developer", new Address("hsr", "bangalore", 567784));
	          employee2.showEmployeeDetails();
	            
		
	}

}
