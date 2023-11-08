package com.excelr.service;

import java.util.List;

import com.excelr.entity.Product;

public interface ProductService {

	Product addProduct(Product product);
	List<Product> getAllProduct();
	Product getProductById(int id);
	Product updateProduct(int id, Product product);
	String  deleteProductById(int id);
	List<Product> findByCategory(String category);
	Product findByName(String name);
	int countByCategory(String category);
	
	List<Product> priceLessThan(int price);
	List<Product> priceGreatherThan(int price);
	List<Product> priceGreatherThanAndCategory(int price, String category);

	

	
	
}
