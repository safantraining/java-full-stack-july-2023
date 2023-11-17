package com.excelr.day14.collection;

public class HashCodeDemo {

	public static void main(String[] args) {

		String name1="john";
		String name2="john";
		
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		
		String name3 = new String("john");
		String name4 = new String("johN");
		
		System.out.println(name3.hashCode());
		System.out.println(name4.hashCode());
		
		System.out.println("========product class======");
		Product p1 = new Product(1, "shampoo");
		Product p2 = new Product(1, "shampoo");
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());


		
	}

}
