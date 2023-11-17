package com.excelr.day5;

class Customer
{
	int id;
	String name;
	
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
	
	
}




public class ToStringDemo {

	public static void main(String[] args) {

		
		int         a     =  10;
		Customer customer = new Customer(1, "john");
		
		System.out.println(a);
		System.out.println(customer);
		
		System.out.println(customer.hashCode());
		
	}

}
