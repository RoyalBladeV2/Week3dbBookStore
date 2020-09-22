package com.example.Week3DBBooks.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book  {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	private String title;
	private String author;
	private String isbn;
	private int year;
	
	public Book(String title, String author, int year, String isbn) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
		this.isbn = isbn;
	}
	
	public Long getID() {
		return id;
	}

	public void setID(Long id) {
		this.id = id;
	}
	
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Book [ID=" + id + ", title=" + title + ", author=" + author + ", isbn=" + isbn + ", year=" + year + "]";
	}
	public String getauthor() {
		return author;
	}
	public void setauthor(String author) {
		this.author = author;
	}
	public String getisbn() {
		return isbn;
	}
	public void setisbn(String isbn) {
		this.isbn = isbn;
	}
	public int getyear() {
		return year;
	}
	public void setyear(int year) {
		this.year = year;
	}
	
	public Book() {}
	
}
