package com.excelr.day17.functionalinterface;

import java.util.ArrayList;

public class WhyWeNeedStream {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		//adding purpose
		for(int i=1;i<=10;i++)
		{
			nums.add(i);
		}
		
		System.out.println("nums :"+ nums);
		
		//without stream.
		for(int num : nums)
		{
			if(num%2==0)
			{
				System.out.println(num);
			}
		}
		
		System.out.println("-----using stream------");
		
		nums.stream().filter(n-> n%2==0).forEach(System.out::println);
		
		
		
	}

}
