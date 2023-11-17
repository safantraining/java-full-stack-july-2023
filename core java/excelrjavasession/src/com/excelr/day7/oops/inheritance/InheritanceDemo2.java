package com.excelr.day7.oops.inheritance;

class Parent
{
	 int a=1;  // global 
}

class Child extends Parent
{
	int a=2;  // global 
	
	void display()
	{
		int a=3;  // local
		
		System.out.println("value of a in local :"+ a);
		System.out.println("value of a in global :"+ this.a);
		System.out.println("value of a in parent:"+ super.a);

	}
}


public class InheritanceDemo2 {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.display();

	}

}
