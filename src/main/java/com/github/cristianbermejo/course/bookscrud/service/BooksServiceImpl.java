package com.github.cristianbermejo.course.bookscrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.cristianbermejo.course.bookscrud.model.Book;

@Service
public class BooksServiceImpl implements BooksService {
	List<Book> books;

	public BooksServiceImpl() {
		this.books = new ArrayList<>();
		
		books.add(new Book(9781491995792L, "Deep Learning Cookbook", "Machine Learning"));
		books.add(new Book(9781449357351L, "Python Cookbook, 3rd Edition", "Programming"));
		books.add(new Book(9781491975336L, "bash Cookbook, 2nd Edition", "Scripting"));
		books.add(new Book(9781492040682L, "R Cookbook, 2nd Edition", "Data analysis"));
		books.add(new Book(9781449319434L, "Regular Expressions Cookbook, 2nd Edition", "Programming"));
	}

	@Override
	public void createBook(Book book) {
		books.add(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return books;
	}

	@Override
	public Book getBook(long isbn) {
		return books.stream()
				.filter(book -> book.getIsbn() == isbn)
				.findFirst()
				.orElse(null);
	}

	@Override
	public void updateBook(Book book) {
		Book storedBook = getBook(book.getIsbn());
		
		if (storedBook != null) {
			storedBook.setTitle(book.getTitle());
			storedBook.setTheme(book.getTheme());
		}
	}

	@Override
	public List<Book> deleteBook(long isbn) {
		books.removeIf(book -> book.getIsbn() == isbn);
		return books;
	}

}
