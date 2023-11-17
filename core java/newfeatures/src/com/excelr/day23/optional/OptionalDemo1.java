package com.excelr.day23.optional;

import java.util.Optional;

public class OptionalDemo1 {

	public static void main(String[] args) {

	
		String name=null;
		
		
		Optional<String> optionalname = Optional.ofNullable(name);
		
	    if(optionalname.isPresent())
	    {
	    	System.out.println(name.toUpperCase());
	    }
	    else
	    {
	    	System.out.println("name is null");
	    }
		
	    System.out.println("==================");
	    
	    
		
	}

}
