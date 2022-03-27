package com.example.mvcbooktracker;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("books")
public class Book {
	private String name;
	private String description;
	private String author;
	private int yearOfRelease;
	private int rating;
	/*
	//Constructor
	public Book(String name, String description, 
				String author, int yearOfRelease, int rating) {
		this.name = name;
		this.description = description;
		this.author = author;
		this.yearOfRelease = yearOfRelease;
		this.rating = rating;
	}
	*/
	//Getter Functions
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public String getAuthor() {
		return author;
	}
	public int getYearOfRelease() {
		return yearOfRelease;
	}
	public int getRating() {
		return rating;
	}

	//Setter Functions
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

}
