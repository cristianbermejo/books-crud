package com.github.cristianbermejo.course.bookscrud.service;

import java.util.List;

import com.github.cristianbermejo.course.bookscrud.model.Book;

public interface BooksService {
	void createBook(Book book);
	List<Book> getAllBooks();
	Book getBook(long isbn);
	void updateBook(Book book);
	List<Book> deleteBook(long isbn);
}
