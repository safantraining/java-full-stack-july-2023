package com.excelr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.entity.Product;
import com.excelr.exception.IdNotFoundException;
import com.excelr.exception.InValidPriceException;
import com.excelr.repository.ProductRepository;
import com.excelr.utility.AppConstant;


@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productRepository;
	
	
	
	@Override
	public Product addProduct(Product product) {
		
		if(product.getPrice()<=0)
		{
			throw new InValidPriceException(AppConstant.PRODUCT_INVALID_PRICE_INFO);
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
		   throw new IdNotFoundException(AppConstant.PRODUCT_ID_NOT_FOUND_INFO);
	   }
	   
	       return optionalProduct.get();
	}



	@Override
	public Product updateProduct(int id, Product product) {
		
		Product updatedProduct=null;
		
		if(productRepository.existsById(id))
		{
		   updatedProduct =	productRepository.save(product);
		 }
		else
		{
			throw new IdNotFoundException(AppConstant.PRODUCT_ID_NOT_FOUND_INFO);
		}
		
		return updatedProduct;
	}



	@Override
	public String deleteProductById(int id) {
		
		String msg;
		if(productRepository.existsById(id))
		{
			productRepository.deleteById(id);
			msg="product successfully deleted";
		}
		else
		{
			throw new IdNotFoundException(AppConstant.PRODUCT_ID_NOT_FOUND_INFO);
		}
		
		return msg;
	}



	@Override
	public List<Product> findByCategory(String category) {
		return productRepository.findByCategory(category);
	}



	@Override
	public Product findByName(String name) {
		return productRepository.findByName(name);
	}



	@Override
	public int countByCategory(String category) {
		return productRepository.countByCategory(category);
	}



	@Override
	public List<Product> priceLessThan(int price) {
		return productRepository.findByPriceLessThan(price);
	}



	@Override
	public List<Product> priceGreatherThan(int price) {
		return productRepository.findByPriceGreaterThanEqual(price);
	}



	@Override
	public List<Product> priceGreatherThanAndCategory(int price, String category) {
		return productRepository.findByPriceGreaterThanAndCategory(price, category);
	}

    

}
