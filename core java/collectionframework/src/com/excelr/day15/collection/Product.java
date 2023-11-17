package com.excelr.day15.collection;

public class Product implements Comparable<Product>{
	
	int id;
	String name;
	int price;
	String category;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, int price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	@Override
	public int compareTo(Product o) {
		    if(price==o.price)
		    	return 0;
		    else if(price>=o.price)
		    	return -1;
		    return 1;
	}
	
	
	

}
