package com.github.cristianbermejo.course.bookscrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.cristianbermejo.course.bookscrud.dao.BookDao;
import com.github.cristianbermejo.course.bookscrud.model.Book;

@Service
public class BooksServiceImpl implements BooksService {
	@Autowired
	BookDao dao;

	@Override
	public void createBook(Book book) {
		dao.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return dao.findAll();
	}

	@Override
	public Book getBook(long isbn) {
		return dao.findById(isbn)
				.orElse(null);
	}

	@Override
	public void updateBook(Book book) {
		dao.save(book);
	}

	@Override
	public List<Book> deleteBook(long isbn) {
		dao.deleteById(isbn);
		return dao.findAll();
	}

}
