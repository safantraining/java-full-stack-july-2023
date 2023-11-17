package com.excelr.day6;

class Parent
{
	Parent(int id)
	{
		System.out.println("parent constructor value of id "+ id);
	}
}
class Child extends Parent
{
	Child(int id)
	{
		super(id);
		System.out.println("child constructor");
		
	}
	
}


public class InheritanceDemo1 {

	public static void main(String[] args) {

		Child child = new Child(3);
	}

}
