package com.excelr.day16.functionalinterface;

class Parent
{
	void breakfast()
	{
		System.out.println("idly");
	}
}
class Child extends Parent
{
	@Override
	void breakfast()
	{
		System.out.println("dosa");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {

		Child child = new Child();
		child.breakfast();
	}

}
