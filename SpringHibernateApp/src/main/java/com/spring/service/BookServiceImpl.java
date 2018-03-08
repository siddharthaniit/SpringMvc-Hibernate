package com.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.BookDao;
import com.spring.model.Book;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;
	public long save(Book book) {
		long save = bookDao.save(book);
		return save;
	}

	public void updateBook(long id, Book book) {
		bookDao.updateBook(id, book);		
	}

	public void delete(long id) {
		bookDao.delete(id);		
	}

	public Book get(long id) {
		Book book = bookDao.get(id);
		return book;
	}

	public List<Book> list() {
		List<Book> list = bookDao.list();
		return list;
	}

}
