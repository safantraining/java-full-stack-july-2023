package com.excelr.day16.functionalinterface;

class Calculation
{
	 static int add(int a, int b)
	{
		return a+b;
	}
	 
	 static int sub(int a, int b)
	 {
			return a-b;
	 }
	 
	 static int mul(int a, int b)
	  {
			return a*b;
	  }
}

@FunctionalInterface
interface MathOperation
{
	   int operation(int a, int b);
}



public class MethodInterfaceWithParameter {

	public static void main(String[] args) {
		
		
		//method reference to static method.
		
		MathOperation op1 = Calculation::mul;
		
		System.out.println("Result :"+op1.operation(2, 3));

	}

}
