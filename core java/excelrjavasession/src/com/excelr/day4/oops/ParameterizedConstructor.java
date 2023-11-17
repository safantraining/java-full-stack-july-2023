package com.excelr.day4.oops;

class Customer
{
	//variable
	int id;       //global
	String name;
	
	// constructor with parameter
	Customer(int id,String name)   // local
	{
		this.id=id;
		this.name=name;
	}
	
	//methods
	void displayCustomerInfo()
	{
		System.out.println("id :"+ id);
		System.out.println("name :"+ name);
	}
}



public class ParameterizedConstructor {

	public static void main(String[] args) {

		Customer customer = new Customer(1,"sachin");
		customer.displayCustomerInfo();
	}

}
