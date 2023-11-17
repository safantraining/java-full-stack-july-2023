package com.excelr.entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String author;
	private String isbn;
	private LocalDate createdDate;
	
	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
	@JsonIgnore
	List<Page> pages;
	
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Book(String name, String author, String isbn, LocalDate createdDate, List<Page> pages) {
		super();
		this.name = name;
		this.author = author;
		this.isbn = isbn;
		this.createdDate = createdDate;
		this.pages = pages;
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
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}


	public List<Page> getPages() {
		return pages;
	}


	public void setPages(List<Page> pages) {
		this.pages = pages;
	}
	
	
	
	
}
