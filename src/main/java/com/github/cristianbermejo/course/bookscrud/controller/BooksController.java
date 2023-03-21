package com.github.cristianbermejo.course.bookscrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.cristianbermejo.course.bookscrud.model.Book;
import com.github.cristianbermejo.course.bookscrud.service.BooksService;

@RestController
public class BooksController {

	@Autowired
	BooksService service;
	
	@GetMapping(value = "book/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Book getBook(@PathVariable("isbn") long isbn) {
		return service.getBook(isbn);
	}
	
	@GetMapping(value = "books", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Book> getAllBooks() {
		return service.getAllBooks();
	}
	
	@PostMapping(value = "book", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createBook(@RequestBody Book book) {
		service.createBook(book);
	}
	
	@PutMapping(value = "book", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateBook(@RequestBody Book book) {
		service.updateBook(book);
	}
	
	@DeleteMapping(value = "book/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Book> deleteBook(@PathVariable("isbn") long isbn) {
		return service.deleteBook(isbn);
	}
}
