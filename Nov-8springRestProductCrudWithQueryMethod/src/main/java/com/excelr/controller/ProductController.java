package com.excelr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.entity.Product;
import com.excelr.exception.InValidPriceException;
import com.excelr.service.ProductService;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("/product")
	public ResponseEntity<Product> addProduct(@RequestBody Product product)
	{
		return new ResponseEntity<Product>(productService.addProduct(product), HttpStatus.OK);
	}
	
	@GetMapping("/product")
	public ResponseEntity<List<Product>> getAllProducts()
	{
		return new ResponseEntity<List<Product>>(productService.getAllProduct(), HttpStatus.OK);
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable int id)
	{
		return new ResponseEntity<Product>(productService.getProductById(id), HttpStatus.OK);
	}
	
	
	@PutMapping("/product/{id}")
	public ResponseEntity<Product> updateProductById(@PathVariable int id,@RequestBody Product product)
	{
		return new ResponseEntity<Product>(productService.updateProduct(id, product), HttpStatus.OK);
	}
	
	@DeleteMapping("/product/{id}")
	public ResponseEntity<String> deleteProductById(@PathVariable int id)
	{
		return new ResponseEntity<String>(productService.deleteProductById(id), HttpStatus.OK);
	}
	
	
	@GetMapping("/product/category/{category}")
	public ResponseEntity<List<Product>> findByCategory(@PathVariable String category)
	{
		return new ResponseEntity<List<Product>>(productService.findByCategory(category), HttpStatus.OK);
	}
	
	@GetMapping("/product/name/{name}")
	public ResponseEntity<Product> findByName(@PathVariable String name)
	{
		return new ResponseEntity<Product>(productService.findByName(name), HttpStatus.OK);
	}
	
	
	@GetMapping("/product/countcategory/{category}")
	public ResponseEntity<Integer> countByCategory(@PathVariable String category)
	{
		return new ResponseEntity<Integer>(productService.countByCategory(category), HttpStatus.OK);
	}
	
	
	@GetMapping("/product/pricelessthan/{price}")
	public ResponseEntity<List<Product>> findByPriceLessthan(@PathVariable int price)
	{
		return new ResponseEntity<List<Product>>(productService.priceLessThan(price), HttpStatus.OK);
	}
	
	@GetMapping("/product/pricegreatherthan/{price}")
	public ResponseEntity<List<Product>> findByPriceGreatherThan(@PathVariable int price)
	{
		return new ResponseEntity<List<Product>>(productService.priceGreatherThan(price), HttpStatus.OK);
	}
	
	
	@GetMapping("/product/pricegreatherthan/{price}/{category}")
	public ResponseEntity<List<Product>> findByPriceGreatherThanAndCategory(@PathVariable int price, @PathVariable String category)
	{
		return new ResponseEntity<List<Product>>(productService.priceGreatherThanAndCategory(price, category), HttpStatus.OK);
	}
	
}
