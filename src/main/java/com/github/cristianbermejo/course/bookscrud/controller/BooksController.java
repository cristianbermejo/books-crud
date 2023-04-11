package com.github.cristianbermejo.course.bookscrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.cristianbermejo.course.bookscrud.model.Book;
import com.github.cristianbermejo.course.bookscrud.service.BooksService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

@RestController
@CrossOrigin("*")
public class BooksController {

	@Autowired
	BooksService service;
	
	@Operation(summary = "Searchs a book by its ISBN")
	@GetMapping(value = "book/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Book getBook(@Parameter(description = "ISBN to search for") @PathVariable("isbn") long isbn) {
		return service.getBook(isbn);
	}
	
	@Operation(summary = "Returns the books list")
	@GetMapping(value = "books", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Book> getAllBooks() {
		return service.getAllBooks();
	}
	
	@Operation(summary = "Adds the book received in the request's body")
	@PostMapping(value = "book", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createBook(@Parameter(description = "JSON object with the book's data") @RequestBody Book book) {
		service.createBook(book);
	}
	
	@Operation(summary = "Updates an existing book with the data received in the request's body")
	@PutMapping(value = "book", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateBook(@Parameter(description = "JSON object with the book's data") @RequestBody Book book) {
		service.updateBook(book);
	}
	
	@Operation(summary = "Deletes a book by its ISBN")
	@DeleteMapping(value = "book/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Book> deleteBook(@Parameter(description = "ISBN of the book to delete") @PathVariable("isbn") long isbn) {
		return service.deleteBook(isbn);
	}
}
