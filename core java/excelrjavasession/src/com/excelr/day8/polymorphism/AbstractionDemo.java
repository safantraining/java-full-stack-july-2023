package com.excelr.day8.polymorphism;

abstract class Oven
{
	abstract void heating();  
	void brandName()
	{
		System.out.println("xyz brand");
	}

}

class Tea extends Oven
{

	@Override
	void heating() {
        System.out.println("10 mts tea heating");		
	}
}

class Rice extends Oven
{

	
	void heating() 
	{
		System.out.println("20 mts for rice heating");
	}
	
}


public class AbstractionDemo {

	public static void main(String[] args) {

		Oven oven = new Rice();
		oven.heating();
		oven.brandName();
		
	}

}
