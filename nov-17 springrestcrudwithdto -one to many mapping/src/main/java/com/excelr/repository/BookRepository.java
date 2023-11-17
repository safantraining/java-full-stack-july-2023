package com.excelr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelr.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

	
}
