package com.excelr.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "page")
public class Page {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String chapter;
	private String content;
	private int number;
    
    
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bookid", referencedColumnName = "id")
	@JsonIgnore
	Book book;
	
	
	
	
	public Page() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Page(String chapter, String content, int number, Book book) {
		super();
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
