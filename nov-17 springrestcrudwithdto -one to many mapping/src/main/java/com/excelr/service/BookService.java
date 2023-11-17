package com.excelr.service;

import java.util.List;

import com.excelr.dto.BookDto;

public interface BookService {

	BookDto addBook(BookDto bookDto);
	List<BookDto> getAllBooks();
	BookDto getBookById(int id);
	
}
