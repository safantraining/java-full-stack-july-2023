package com.excelr.day16.functionalinterface;


interface Operation
{
	int largest(int a, int b, int c);
}

public class FunctionalInterfaceDemo2 {

	public static void main(String[] args) {

		
		Operation op = (a,b,c) -> {
			  if(a>b && a>c)
				  return a;
			  else if(b>a && b>c)
				  return b;
			  return c;
		};
	
		System.out.println("largest "+op.largest(3, 7, 6));
		
		
		Operation op2 = (a,b,c) -> a+b+c;
		
		System.out.println("addition :"+ op2.largest(2, 3, 4));
		
	}

}
