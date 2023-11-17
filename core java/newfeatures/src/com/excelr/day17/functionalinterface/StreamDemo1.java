package com.excelr.day17.functionalinterface;

import java.util.ArrayList;

public class StreamDemo1 {

	public static void main(String[] args) {

	ArrayList<Integer> nums = new ArrayList<Integer>();
		
		//adding purpose
		for(int i=1;i<=10;i++)
		{
			nums.add(i);
		}
		
	  nums.forEach(s->System.out.println(s));
	  
	  System.out.println("----method reference---");
	  
	 nums.forEach(System.out::println);
		
	}

}
