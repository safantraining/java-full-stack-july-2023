package com.excelr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excelr.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Integer>{

	public List<Product> findByCategory(String category);
	public Product findByName(String name);
	public int countByCategory(String category);
	public List<Product> findByNameContaining(String query);
	public List<Product> findByNameStartingWith(String query);
	
	List<Product> findByPriceLessThan(int price);
	List<Product> findByPriceGreaterThanEqual(int age);
	List<Product> findByPriceGreaterThanAndCategory(int price, String category);


	                  

}
