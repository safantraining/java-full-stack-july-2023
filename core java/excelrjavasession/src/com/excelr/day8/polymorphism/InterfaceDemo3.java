package com.excelr.day8.polymorphism;

interface Bank
{
	void bankHoliday();
}
interface Rbi
{
	
	void bankHoliday();
}

class Customer
{
	void address()
	{
		System.out.println("btm layout");
	}
	void bankHoliday()
	{
		System.out.println("2 days holiday ");
	}
}

class Kotak extends Customer implements Bank, Rbi
{

	@Override
	public void bankHoliday() {
		System.out.println("4 days holiday");
	}

	

	

	
}

public class InterfaceDemo3 {

	public static void main(String[] args) {

		Rbi rbi = new Kotak();
		rbi.bankHoliday();
		
		System.out.println("============");
		Customer customer = new Kotak();
		customer.address();
		customer.bankHoliday();
		
	}

}
