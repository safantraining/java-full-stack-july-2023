package com.excelr.service;

import java.util.List;

import com.excelr.entity.Product;

public interface ProductService {

	Product addProduct(Product product);
	List<Product> getAllProduct();
	Product getProductById(int id);
	
}
