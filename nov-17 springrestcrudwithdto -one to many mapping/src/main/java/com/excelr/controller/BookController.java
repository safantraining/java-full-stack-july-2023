package com.excelr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.dto.BookDto;
import com.excelr.service.BookService;

@RestController
@RequestMapping("api/v1")
public class BookController {

	@Autowired
	BookService bookService;
	
	@PostMapping("/book")
	ResponseEntity<BookDto> addBook(@RequestBody BookDto bookDto)
	{
		return new ResponseEntity<BookDto>(bookService.addBook(bookDto), HttpStatus.OK);
	}
	
	@GetMapping("/book")
	ResponseEntity<List<BookDto>> getAllBooks()
	{
		return new ResponseEntity<List<BookDto>>(bookService.getAllBooks(), HttpStatus.OK);
	}
	
	
	@GetMapping("/book/{id}")
	ResponseEntity<BookDto> getBookById(@PathVariable int id)
	{
		return new ResponseEntity<BookDto>(bookService.getBookById(id), HttpStatus.OK);
	}
}
