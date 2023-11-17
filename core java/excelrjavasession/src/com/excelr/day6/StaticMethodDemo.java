package com.excelr.day6;

class Calculation
{
     int x=100;	
     static int y=200;
	
	int add(int a,int b)
	{
		return a+b+x;
	}
	
	static int sub(int a, int b)
	{
		Calculation c = new Calculation();
		
		return a+b+c.x;
	}
}


public class StaticMethodDemo {

	public static void main(String[] args) {
 
		int addResult=0;
		int subResult=0;
		
		
		Calculation calObj = new Calculation();
		
		addResult=calObj.add(1, 1);
		subResult=Calculation.sub(1, 1);
		
		System.out.println("add result "+ addResult);
		System.out.println("sub result "+ subResult);
		
		}
}
