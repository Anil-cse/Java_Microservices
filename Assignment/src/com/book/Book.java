package com.book;

import com.book.exception.InvalidBookException;

public class Book {

	private String bookID;
	private String title;
	private String author;
	private String category;
	private float price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookID, String title, String author, String category, float price) throws InvalidBookException {
		super();
		if (bookID.length() == 4 && bookID.startsWith("B")) {
			this.bookID = bookID;
		} else {
			throw new InvalidBookException("BookID must start with ‘B’ and must be of length 4 characters");
		}
		this.title = title;
		this.author = author;
		if (category.equalsIgnoreCase("Science") || category.equalsIgnoreCase("Fiction")
				|| category.equalsIgnoreCase("Technology") || category.equalsIgnoreCase("Others")) {
			this.category = category;
		} else {
			throw new InvalidBookException("Category must be “Science”, “Fiction”, “Technology” or “Others” ");
		}
		if (price > 0) {
			this.price = price;
		} else {
			throw new InvalidBookException("Price cannot be negative");
		}
	}
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", title=" + title + ", author=" + author + ", category=" + category
				+ ", price=" + price + "]";
	}
	
	
}
