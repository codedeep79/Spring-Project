package com.nth.demo.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nth.demo.dao.BookRepository;
import com.nth.demo.model.Book;

@Service
public class BookServices {
	@Autowired
	private BookRepository bookRepository;
	
	public Collection<Book> findAllBook(){
		List<Book> books = new ArrayList<Book>();
		for (Book book: bookRepository.findAll()) {
			books.add(book);
		}
		return books;
	}
	public void delete(long id){
		bookRepository.deleteById(id);
	}
}
