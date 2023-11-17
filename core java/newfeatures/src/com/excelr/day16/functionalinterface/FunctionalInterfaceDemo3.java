package com.excelr.day16.functionalinterface;

interface Bank
{
	 void displayBankDetails(String name);
}

public class FunctionalInterfaceDemo3 {

	public static void main(String[] args) {

		// single line body
		Bank b1 = (name) -> System.out.println("your bank name is "+ name);
		
		//multiline body
		Bank b2 =(name) -> {
			System.out.println("bank name "+ name);
			System.out.println("length of name "+ name.length());
		};
		
		
		b1.displayBankDetails("rbi");
		
		System.out.println("------------");
		
		b2.displayBankDetails("kotak");
	}

}
