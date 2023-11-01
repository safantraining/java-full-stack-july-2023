package com.excelr;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.excelr.entity.Product;
import com.excelr.repository.ProductRepository;

@SpringBootApplication
public class SpringdatajpaApplication implements CommandLineRunner{

	@Autowired
	ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
	
		
		Product product = new Product("tshirt", 6000, "cloth");
		
		System.out.println("----save the data---");
	//	productRepository.save(product);
		System.out.println("--successfully saved----");
		
	   
		
		
		
		
		
		System.out.println("CASE 2: RETERIVE BY ALL");
	    //reteriving all the products
	    List<Product> products=  productRepository.findAll();
	   
	    System.out.println("reteriving---using java8 feature");
		products.forEach(System.out::println);
	
         System.out.println("reteriving ---using for each loop");
	     
	    for(Product product2 : products)
	    {
	    	System.out.println(product2);
	    }
		
	
	 
	    
	    
	    
	    System.out.println("CASE 3 : RETERIVE BY ID");
	    System.out.println("---find by id --- retervive the product based on ID");
	    Optional<Product> productOptional=    productRepository.findById(2);
	    
	    if(productOptional.isPresent())
	    {
	    	System.out.println(productOptional.get());
	    }
	    else
	    {
	    	System.out.println("no product found for the given id");
	    }
	    
	    System.out.println("reterive by id in sample way");
	    Product product2=  productRepository.findById(4).get();
	    System.out.println(product2);
	    
	  
	    
	    
	    
	 
	    
	    
	    System.out.println("CASE 4: DELETE THE PRODUCT");
	     if(productRepository.existsById(5))
	     {
	    	 productRepository.deleteById(5);
	    	 System.out.println("product successfully deleted");
	     }
	     else
	     {
	    	 System.out.println("no id found to delete");
	     }
	}

}
