package com.excelr.day17.functionalinterface;

import java.util.function.Predicate;

public class InbuiltFunctionalInterface {

	public static void main(String[] args) {

		Predicate<Integer> p1 = (age) -> age>18;
	
         System.out.println(p1.test(23));
	     System.out.println(p1.test(17));
	     
	     System.out.println("-----------");
	     Predicate<String> p2 = (name) ->name.contains("a");
	     System.out.println(p2.test("safan"));
	     System.out.println(p2.test("john"));
	     
	     
	}

}
