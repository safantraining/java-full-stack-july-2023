package com.excelr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/user")
	public String display()
	{
		return "this is user";
	}
	
	@GetMapping("/admin")
	public String display2()
	{
		return "this is admin";
	}
	
}
