package com.github.cristianbermejo.course.bookscrud.model;

public class Book {
	private long isbn;
	private String title;
	private String theme;
	
	public Book(long isbn, String title, String theme) {
		this.isbn = isbn;
		this.title = title;
		this.theme = theme;
	}

	public Book() {
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
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
