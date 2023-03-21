package com.github.cristianbermejo.course.bookscrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "books")
public class Book {
	@Id
	private Long isbn;
	private String title;
	private String theme;
	
	public Book(Long isbn, String title, String theme) {
		this.isbn = isbn;
		this.title = title;
		this.theme = theme;
	}

	public Book() {
	}

	public Long getIsbn() {
		return isbn;
	}

	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}
}
