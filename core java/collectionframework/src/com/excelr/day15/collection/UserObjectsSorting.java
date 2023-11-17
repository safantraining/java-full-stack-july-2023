package com.excelr.day15.collection;

import java.util.ArrayList;
import java.util.Collections;

public class UserObjectsSorting {

	public static void main(String[] args) {

		
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "laptop", 50000, "electronics"));
		products.add(new Product(7, "headphone", 3000, "electronics"));
		products.add(new Product(3, "shirt", 4000, "cloth"));
		products.add(new Product(2, "toy", 2000, "toy"));

		for(Product product : products)
			System.out.println(product);
	
		Collections.sort(products);
		
		System.out.println("after sorting");
		
		for(Product product : products)
			System.out.println(product);
	

		for(Product product : products)
			System.out.println(product);
	}

}
