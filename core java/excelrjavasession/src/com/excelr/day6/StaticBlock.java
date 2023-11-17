package com.excelr.day6;

public class StaticBlock {

	
	static
	{
	   System.out.println("static block 1");	
	}
	
    public static void main(String[] args) {

		System.out.println("main method");
	}
	
	static
	{
		System.out.println("static block 2");
	}

}
