package com.excelr.day10.string;

public class StringDemo1 {

	public static void main(String[] args) {

		    String s1="hello";
		    String s2="hello";
		 
		    
		    String s3 = new String("hello");
		    String s4 = new String("hello");
		    
		      System.out.println("----using (==)----");

		    
		      System.out.println("s1==s2 " + (s1==s2));   // t
		      System.out.println("s3==s4 " + (s3==s4));   // f
		     
		      System.out.println("----using equals----");
		      
		      System.out.println("s1 s2 " + (s1.equals(s2)));  //
		      System.out.println("s3 s4 " + (s3.equals(s4)));

		    
		
		
	}

}
