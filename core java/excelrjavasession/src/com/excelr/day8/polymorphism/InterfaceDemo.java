package com.excelr.day8.polymorphism;

interface Test
{
	int bonus=5000;
	
	void greet();
	
}

class Employee implements Test
{

	@Override
	public void greet() {
            System.out.println("welcome all" + Test.bonus);		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {

		
	}

}
