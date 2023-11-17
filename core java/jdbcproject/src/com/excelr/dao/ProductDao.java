package com.excelr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.excelr.dbconfig.DBConnection;
import com.excelr.model.Product;

public class ProductDao {

	
	
	public String addProduct(Product product) throws Exception
	{     
	    Connection con=	DBConnection.connect();
	  PreparedStatement ps =  con.prepareStatement("insert into product values(?,?,?,?)");
	    ps.setInt(1, product.getId());
	    ps.setString(2, product.getName());
	    ps.setString(3, product.getDescription());
	    ps.setInt(4, product.getPrice());
	    
	    ps.execute();
		
		return "product added successfully";
	}
	
	
	public ArrayList<Product> getAllProduct() throws Exception
	{
		ArrayList<Product> products = new ArrayList<Product>();
		
		Connection con= DBConnection.connect();
	  Statement stmt =con.createStatement();
	    ResultSet rs=  stmt.executeQuery("select * from product");
	    while(rs.next())
	    {
	    	products.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
	    }
	    
		
		return products;
	}
	
	public Product getProductById(int id) throws Exception
	{
		Product product = null;
		    Connection con= DBConnection.connect();
		   PreparedStatement ps =con.prepareStatement("select * from product where id=?");
		   ps.setInt(1, id);
		    ResultSet rs=  ps.executeQuery();
		  
		    ResultSetMetaData rsmd=rs.getMetaData();  
		    System.out.println(rsmd.getColumnName(1)+" "+ rsmd.getColumnName(2)+" "+ rsmd.getColumnName(3)
		       +" "+rsmd.getColumnName(4));
		   
		    while(rs.next())
		    {
		    	product = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
		    }
		
		return product;
	}
	
	public void getColumnName()
	{
	
	}
}
