package com.excelr.day7.oops.inheritance;

class Flipkart
{
	void filter()
	{
		System.out.println("--default filter--");
	}
	
	void filter(int model)
	{
		System.out.println("-- filter by model --"+ model);

	}
	
	void filter(double price)
	{
		System.out.println("-- filter by price --"+ price);

	}
	void filter(String brand)
	{
		System.out.println("-- filter by brand --"+ brand);
	
	}
	
}




public class OverloadingDemo {

	public static void main(String[] args) {

		Flipkart flipkart = new Flipkart();
		flipkart.filter(2022);
		
		
		
	}

}
