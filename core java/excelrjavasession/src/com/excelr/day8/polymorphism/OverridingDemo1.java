package com.excelr.day8.polymorphism;

class Parent
{
	void breakfast()
	{
		System.out.println("idly");
	}
}
class Child extends Parent
{
	//redefining the same method, with new implementation in sub class
	void breakfast()
	{
		super.breakfast();
		System.out.println("dosa");
	}
	
	void hotdrink()
	{
		System.out.println("had tea");
	}
}

public class OverridingDemo1 {

	public static void main(String[] args) {

		Child child = new Child();
		child.breakfast();
		child.hotdrink();
	
		System.out.println("----upcasting---");
		//reference of parent , object of child
		Parent p1 = new Child();
		p1.breakfast();
		//p1.hotdrink();
		
		
		
		
	}

}
