package com.excelr.day16.functionalinterface;

@FunctionalInterface
interface Demo
{
	void display();
}

class Employee
{
	void showMessage()
	{
		System.out.println("this show message in employee class");
	}
}


public class MethodReferenceDemo1 {

	public static void main(String[] args) {

		//1st way using lamda expression
		Demo d1 = ()->System.out.println("display implementation by lamda expression ");
		d1.display();
		
		System.out.println("---------------------------------------");
		
		//2nd using method reference
		Employee employee = new Employee();
		
		Demo d2 = employee::showMessage;
		d2.display();
		
		
		
	}

}
