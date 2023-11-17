package com.excelr.day7.oops.inheritance;

class Vehicle
{
     Vehicle(String vehicleName)
     {
        System.out.println("vehicle constructor-- modelNo = " + vehicleName);	 
     }
	
	
}

class Car extends Vehicle
{
	Car(String vehicleName)
	{    
		super(vehicleName);
		System.out.println("car constructor");
		
	}
	
	
}


public class SingleInheritance {

	public static void main(String[] args) {

		//Vehicle vehicle = new Vehicle();   // It creates parent object
		System.out.println("=====================");
		Car car = new Car("audi");    //   // It creates child class object + parent class object
	}

}
