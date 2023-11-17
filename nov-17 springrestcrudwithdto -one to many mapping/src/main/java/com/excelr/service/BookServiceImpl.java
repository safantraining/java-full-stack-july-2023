package com.excelr.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.dto.BookDto;
import com.excelr.dto.PageDto;
import com.excelr.entity.Book;
import com.excelr.entity.Page;
import com.excelr.repository.BookRepository;
import com.excelr.repository.PageRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	PageRepository pageRepository;
	
	@Override
	public BookDto addBook(BookDto bookDto) {
		       
		return convertToDto(bookRepository.save(convertToEntity(bookDto)));
	}

	@Override
	public List<BookDto> getAllBooks() {
		     List<Book> books=  bookRepository.findAll();
		     
		     List<BookDto> bookDtos = new ArrayList<>();
		     for(Book book: books)
		     {
		    	 bookDtos.add(convertToDto(book));
		     }
		    	 
		     
		return bookDtos;
	}

	

	@Override
	public BookDto getBookById(int id) {
	     	return convertToDto(bookRepository.findById(id).get());
	}
	
	
	
	
	
	
	
	
	
	  
	
	private Book convertToEntity(BookDto bookDto)
	{
		Book book = new Book();
		book.setName(bookDto.getName());
		book.setAuthor(bookDto.getAuthor());
		book.setIsbn(bookDto.getIsbn());
		book.setCreatedDate(LocalDate.now());
		
		List<PageDto> pageDtos =  bookDto.getPageDtos();
		
		List<Page> pages = new ArrayList<Page>();
		
		for(PageDto pageDto : pageDtos)
		{
              Page page = new Page();
              page.setNumber(pageDto.getNumber());
              page.setContent(pageDto.getContent());
              page.setChapter(pageDto.getChapter());
              page.setBook(book);
              
              pages.add(page);
             
		}
		
		book.setPages(pages);
		
		
		
		
		
	
		
		
		return book;
	}
	
	private BookDto convertToDto(Book book)
	{
		BookDto bookDto = new BookDto();
		bookDto.setId(book.getId());
		bookDto.setName(book.getName());
		bookDto.setIsbn(book.getIsbn());
		bookDto.setAuthor(book.getAuthor());
		bookDto.setCreatedDate(book.getCreatedDate());
		
		List<Page> pages = book.getPages();
		
		List<PageDto> pageDtos = new ArrayList<>();
		
		for(Page page : pages)
		{
			pageDtos.add(new PageDto(page.getId(), page.getChapter(), page.getContent(), page.getNumber(), page.getBook()));
		}
		
		bookDto.setPageDtos(pageDtos);
		
		
		return bookDto;
	}

	
	
	
}
