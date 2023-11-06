package com.excelr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.entity.Product;
import com.excelr.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	ProductRepository productRepository;
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product)
	{
		return productRepository.save(product);
	}
	
	
	
	
	@GetMapping("/product")
	public List<Product> getAllProducts()
	{
		return productRepository.findAll();
	}
	
	
	
	
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable int id)
	{
		return productRepository.findById(id).get();
	}
	
	
	
	
	
	
	@DeleteMapping("/product/{id}")
	public String deleteProduct(@PathVariable int id)
	{
		if(productRepository.existsById(id))
		{
			productRepository.deleteById(id);
		}
		else
		{
			return "no id found to delete";
		}
		
		return "product successfully deleted";
	}

	
	
	
	
	
	
	
	@PutMapping("/product/{id}")
	public String updateProduct(@PathVariable int id, @RequestBody Product product)
	{
		if(productRepository.existsById(id))
		{
			productRepository.save(product);
		}
		else
		{
			return "no id found to update";
		}
		return "product updated";
	}
	
}
