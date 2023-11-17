package com.excelr.day23.optional;

import java.util.Optional;

public class OptionalDemo3 {

	public static void main(String[] args) {

		Optional<String> name1 = Optional.ofNullable("safan");
		Optional<String> name2 = Optional.ofNullable(null);

		
		System.out.println(name1);
		System.out.println(name2);
		
		String n1 = name1.get();
		System.out.println("name1 is "+ n1);
		
		String n2 = name2.get();
		System.out.println("name2 is "+ n2);
	}

}
