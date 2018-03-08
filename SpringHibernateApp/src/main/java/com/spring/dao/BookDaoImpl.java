package com.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.Book;

@Repository
public class BookDaoImpl implements BookDao{
    
	@Autowired
	private SessionFactory sessionFactory;
	
	public long save(Book book) {
		sessionFactory.getCurrentSession().saveOrUpdate(book);
		return book.getId();
	}

	public void updateBook(long id, Book book) {
		
		Book load = sessionFactory.getCurrentSession().load(Book.class, id);
		load.setTitle(book.getTitle());
		load.setAuthor(book.getAuthor());
		
	}

	public void delete(long id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Book load = currentSession.byId(Book.class).load(id);
		currentSession.delete(load);
		
	}

	public Book get(long id) {
		return	sessionFactory.getCurrentSession().get(Book.class, id);
		 
	}

	public List<Book> list() {
		return	sessionFactory.getCurrentSession().createQuery("from Book").list();
		 
	}

}
