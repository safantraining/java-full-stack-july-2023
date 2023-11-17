package com.excelr.day23.optional;

import java.util.Optional;

public class OptionalDemo2 {

	public static void main(String[] args) {

		String dept="safan";
		
		//System.out.println(dept.toUpperCase());
		
		Optional<String> opt = Optional.ofNullable(dept);
		if(opt.isEmpty())
		{
			System.out.println("it is empty");
		}
		
		if(opt.isPresent())
		{
			System.out.println("value is present");
		}
		
		System.out.println(opt);
 	}

}
