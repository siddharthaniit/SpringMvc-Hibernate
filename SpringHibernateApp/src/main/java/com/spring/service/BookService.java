package com.spring.service;

import java.util.List;

import com.spring.model.Book;

public interface BookService {
	
	public long save(Book book);
	void updateBook(long id,Book book);
	void delete(long id);
	Book get(long id);
	List<Book> list();
	
}
