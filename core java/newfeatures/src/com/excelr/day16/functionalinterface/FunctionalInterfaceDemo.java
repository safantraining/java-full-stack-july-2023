package com.excelr.day16.functionalinterface;

@FunctionalInterface
interface Test
{
	void display();
}



public class FunctionalInterfaceDemo {

	public static void main(String[] args) {

		Test t1 =  () -> System.out.println("this is display method");
		t1.display();
	}

}
