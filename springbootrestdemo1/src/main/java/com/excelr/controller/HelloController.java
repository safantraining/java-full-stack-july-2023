package com.excelr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/admin")
	public String adminMessage()
	{
		return "hello admin";
	}
	
	
	@GetMapping("/user")
	public String userMessage()
	{
		return "hello user";
	}
}
