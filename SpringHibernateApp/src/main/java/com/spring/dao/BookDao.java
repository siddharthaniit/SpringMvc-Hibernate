package com.spring.dao;

import java.util.List;

import com.spring.model.Book;

public interface BookDao {
	
	public long save(Book book);
	void updateBook(long id,Book book);
	void delete(long id);
	Book get(long id);
	List<Book> list();
	

}
