package com.excelr.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.model.Arithmetic;

@RestController
public class CalculationController {

	@PostMapping("/add")
	public int add(@RequestBody Arithmetic arithmetic)
	{
		return arithmetic.getValue1()+arithmetic.getValue2();
	}
	
	@PostMapping("/sub")
	public int sub(@RequestBody Arithmetic arithmetic)
	{
		return arithmetic.getValue1()-arithmetic.getValue2();
	}
	
	@PostMapping("/mul")
	public int multiply(@RequestBody Arithmetic arithmetic)
	{
		return arithmetic.getValue1()*arithmetic.getValue2();
	}
	

}
