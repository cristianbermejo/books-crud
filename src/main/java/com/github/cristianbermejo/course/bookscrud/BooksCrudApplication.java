package com.github.cristianbermejo.course.bookscrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"com.github.cristianbermejo.course.bookscrud.controller",
		"com.github.cristianbermejo.course.bookscrud.service"
})
public class BooksCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksCrudApplication.class, args);
	}

}
