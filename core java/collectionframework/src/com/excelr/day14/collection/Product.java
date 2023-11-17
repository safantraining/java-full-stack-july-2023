package com.excelr.day14.collection;

import java.util.Objects;

public class Product {
  
	int id;
	String name;
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
}
