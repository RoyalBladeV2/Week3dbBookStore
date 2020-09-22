package com.example.Week3DBBooks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Week3DBBooks.domain.Book;
import com.example.Week3DBBooks.domain.BookRepository;

@SpringBootApplication
public class Week3DbBooksApplication {
	private static final Logger log = LoggerFactory.getLogger(BookRepository.class);

	public static void main(String[] args) {
		SpringApplication.run(Week3DbBooksApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner BookDemo(BookRepository repository) {
		return (args) -> {
			log.info("save a couple of students");
			repository.save(new Book("The House of hades", "Rick Riordan", 2013, "9780141339191"));
			repository.save(new Book("The Art Of War", "Sun Tzu", -500,"9781982530662"));
			repository.save(new Book("Percy Jackson", "Rick Riordan", 2010, "9780141339546"));
			
			log.info("fetch all Book");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}

		};
	}
}
