package com.excelr.day8.polymorphism;

class RBI
{
	int bonus=100;
	void rateOfInterest()
	{
		System.out.println("RBI 4% ROI");
	}
	void holiday()
	{
		System.out.println("all week ends holiday");
	}
}

class Axis extends RBI
{
	int bonus = 6000;
	
	void rateOfInterest()
	{
		System.out.println("AXIS 7% ROI");
	}
	
	void workingHours()
	{
		System.out.println("9am to 7 pm");
	}
}


public class OverridingDemo2 {

	public static void main(String[] args) {

	    System.out.println("====parent object ==="); 
	     RBI rbi = new RBI();
	     rbi.rateOfInterest();
	     rbi.holiday();
	     
	     System.out.println("=====child object======");
	     Axis axis = new Axis();
	     axis.rateOfInterest();
	     axis.holiday();
	     axis.workingHours();
	     System.out.println(axis.bonus);
	     
	     System.out.println("=====upcasting parent reference child object======");
	     RBI obj = new Axis();
	     obj.rateOfInterest();
	     obj.holiday();
	   //  obj.workingHours();
	     System.out.println(obj.bonus);
		
		
	}

}
