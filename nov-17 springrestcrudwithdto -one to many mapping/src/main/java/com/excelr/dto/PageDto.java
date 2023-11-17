package com.excelr.dto;

import com.excelr.entity.Book;


public class PageDto {

	private int id;
	private String chapter;
	private String content;
	private int number;
    
     Book book;

     
     
	public PageDto(int id, String chapter, String content, int number, Book book) {
		super();
		this.id = id;
		this.chapter = chapter;
		this.content = content;
		this.number = number;
		this.book = book;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChapter() {
		return chapter;
	}

	public void setChapter(String chapter) {
		this.chapter = chapter;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
     
     
}
