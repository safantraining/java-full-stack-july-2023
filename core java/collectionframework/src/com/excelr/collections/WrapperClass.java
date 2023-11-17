package com.excelr.collections;

public class WrapperClass {

	public static void main(String[] args) {

		int a = 100; // primitive
		System.out.println(a);
		
		// manually
		Integer b = Integer.valueOf(a);
		System.out.println(b);
		
		Integer c = a;
		System.out.println(c);
		
		System.out.println("=========");
		
		Integer x = 200;
		System.out.println(x);
		
		int y = x;
		System.out.println(y);
	}

}
