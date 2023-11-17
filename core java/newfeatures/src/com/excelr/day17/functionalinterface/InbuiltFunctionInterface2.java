package com.excelr.day17.functionalinterface;

import java.util.function.Function;

public class InbuiltFunctionInterface2 {

	public static void main(String[] args) {

		Function<Integer, String> f1 =  (age) -> {
			  if(age>18)
				  return "eligible to vote";
			  return "not eligible";
			    };
			    
			    
			    System.out.println(f1.apply(2));
	
	   Function<String, Integer> f2 = (name)-> name.length();
	   System.out.println(f2.apply("mahesh"));
	   
	
	}

}
