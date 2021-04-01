package com.nth.demo.controllers.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nth.demo.model.Book;
import com.nth.demo.services.BookServices;

@RestController
public class MainRestController {
	@Autowired
	private BookServices bookServices;
	
	@GetMapping(value = "/")
	public String helloworld() {
		return "Hello world";
	}
	
	@GetMapping("/findAllBook")
	public Collection<Book> getAllBook() {
		return bookServices.findAllBook();
	}
	@GetMapping("/delete")
	public void deleteBook(@RequestParam long id) {
		bookServices.delete(id);
	}
}
