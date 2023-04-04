package com.github.cristianbermejo.course.bookscrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
		"com.github.cristianbermejo.course.bookscrud.controller",
		"com.github.cristianbermejo.course.bookscrud.service",
		"com.github.cristianbermejo.course.bookscrud"
})
@EnableJpaRepositories(basePackages = "com.github.cristianbermejo.course.bookscrud.dao")
@EntityScan(basePackages = "com.github.cristianbermejo.course.bookscrud.model")
public class BooksCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksCrudApplication.class, args);
	}

}
