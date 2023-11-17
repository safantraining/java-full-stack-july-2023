package com.excelr.mainapp;

import java.util.ArrayList;
import java.util.Scanner;

import com.excelr.dao.ProductDao;
import com.excelr.model.Product;
import com.excelr.utility.UserInput;

public class ProductApp {

	public static void main(String[] args) throws Exception {

		ProductDao productDao = new ProductDao();
		
		Scanner scanner = new Scanner(System.in);
		UserInput userInput = new UserInput();
		String ch="yes";
		
		while(ch.equalsIgnoreCase("yes"))
		{
			
		
		System.out.println("======product Management APP==========");
	    System.out.println("press 1. add product \n 2. view all product \n 3. view product by id \n "
	    		+ "4.update product \n  5.delete product by id \n");
		
		System.out.println("enter your choice");
		int choice = scanner.nextInt();
		
		
		
		
		switch(choice)
		{
		case 1:
			
		      Product product=	userInput.getProductInput();
				 String result =	productDao.addProduct(product);
		      System.out.println("Result :"+ result);
		   break;
		
		case 2:
			System.out.println("---View all product----");
			
			 ArrayList<Product> products =  productDao.getAllProduct();
			 products.forEach(System.out::println);
		break;
		
		case 3:
			 System.out.println("--get product by id--");
			int id= userInput.getIdInput();
			
			Product product2=  productDao.getProductById(id);
		 System.out.println(product2.getId() +" "+ product2.getName() +" "+ product2.getDescription() +" "+product2.getPrice());
			
			break;
		
			
			
	    default:
	    	 System.out.println("invalid choice");
		}
	    
		  System.out.println("to continue press yes");
		     ch=   scanner.next();
		
		}
		
		System.out.println("----EXIT----");
	}

}
