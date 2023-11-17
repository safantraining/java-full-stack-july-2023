package com.excelr.day14.collection;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {

		HashSet<String> items = new HashSet<String>();
		items.add("shampoo");
		items.add("body wash");
		items.add("shampoo");
		
		System.out.println("items :"+ items);
		
		
		HashSet<Product> hs = new HashSet<Product>();
		hs.add(new Product(1, "shampoo"));
		hs.add(new Product(2, "body wash"));
		hs.add(new Product(1, "shampoo"));
		
		System.out.println("products :"+ hs);

	}

}
