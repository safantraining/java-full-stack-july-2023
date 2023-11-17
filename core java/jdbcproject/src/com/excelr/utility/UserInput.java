package com.excelr.utility;

import java.util.Scanner;

import com.excelr.model.Product;

public class UserInput {

	
	public Product getProductInput()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("---add product----");
		
		System.out.println("enter id");
		int id = scanner.nextInt();
		
		System.out.println("enter name");
		String name=scanner.next();
		
		System.out.println("enter description");
		String description=scanner.next();
		

		System.out.println("enter price");
		int price = scanner.nextInt();
		
		Product product = new Product(id, name, description, price);
		return product;

	}
	
	public int getIdInput()
	{
         Scanner scanner = new Scanner(System.in);
		
	    System.out.println("enter id");
		int id = scanner.nextInt();
		
		return id;
	}
}
