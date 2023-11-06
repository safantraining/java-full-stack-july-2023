package com.excelr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.entity.Product;
import com.excelr.repository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productRepository;
	
	
	
	@Override
	public Product addProduct(Product product) {
		
		if(product.getPrice()<=0)
		{
			throw new ArithmeticException("price should be greater than 0");
		}
		
		return productRepository.save(product);
	}

	
	
	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	
	
	
	@Override
	public Product getProductById(int id) {
	   Optional<Product> optionalProduct=productRepository.findById(id);
	   
	   if(optionalProduct.isEmpty())
	   {
		   System.out.println("no id found to get");
	   }
		
		return optionalProduct.get();
	}

}
