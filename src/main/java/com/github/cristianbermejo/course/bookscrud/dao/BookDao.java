package com.github.cristianbermejo.course.bookscrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.cristianbermejo.course.bookscrud.model.Book;

public interface BookDao extends JpaRepository<Book, Long> {

}
