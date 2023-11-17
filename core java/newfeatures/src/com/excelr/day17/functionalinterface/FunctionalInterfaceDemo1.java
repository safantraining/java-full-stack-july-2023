package com.excelr.day17.functionalinterface;

@FunctionalInterface
interface Bank
{
	void rateOfInterest();
	
	default void message()
	{
		System.out.println("this is default method");
	}
	
	static void display()
	{
		System.out.println("this is static method");
	}
}



public class FunctionalInterfaceDemo1 {

	public static void main(String[] args) {

		Bank.display();
		
		Bank b = () -> System.out.println("5% is the rate of interest");
		b.message();
		b.rateOfInterest();
		
	}

}
