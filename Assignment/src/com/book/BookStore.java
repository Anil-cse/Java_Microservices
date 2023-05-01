package com.book;

import java.util.*;

public class BookStore {
	List<Book> bookList = new ArrayList<>();
	public List<Book> addBook(Book b) {
    bookList.add(b);
    return bookList;
	}
	
	public List<Book> searchByTitle(String title)
	{
		bookList.stream().filter(book->book.getTitle().equalsIgnoreCase(title));
		return bookList;
		
	}

	public List<Book> searchByAuthor(String author)
	{
		bookList.stream().filter(book->book.getAuthor().equalsIgnoreCase(author));
		return  bookList;
	}
	
	public void displayAll()
	{
		bookList.stream().forEach(System.out::println);
	}
}