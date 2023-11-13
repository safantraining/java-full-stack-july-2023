package com.excelr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/addproduct")
	public String addProd()
	{
		return "seller will add the product";
	}
	
	@GetMapping("/viewproduct")
	public String viewProd()
	{
		return "customer will view the product";
	}
	
	
	@GetMapping("/offers")
	public String offer()
	{
		return "this is offer api, it will access by both seller and customer";
	}
	
}
