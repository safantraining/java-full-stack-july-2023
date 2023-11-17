package com.excelr.dto;

import java.time.LocalDate;
import java.util.List;

public class BookDto {

	
	private int id;
	private String name;
	private String author;
	private String isbn;
	private LocalDate createdDate;
	
	List<PageDto> pageDtos;
	
	
	public BookDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookDto(int id, String name, String author, String isbn, LocalDate createdDate) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.isbn = isbn;
		this.createdDate = createdDate;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public List<PageDto> getPageDtos() {
		return pageDtos;
	}
	public void setPageDtos(List<PageDto> pageDtos) {
		this.pageDtos = pageDtos;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	
	
}
