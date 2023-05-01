package com.bookutil;

import java.util.*;

import com.book.Book;
import com.book.BookStore;


public class BookUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookStore bookStore = new BookStore();
		Scanner s=new Scanner(System.in);
		
		 int i,choice;
         for(i=0;i<50;i++){
             System.out.println("1.Add Book");
             System.out.println("2.Display all book details");
             System.out.println("3.Search Book by author");
             System.out.println("4.Search Book by title");
             System.out.println("5.Exit");
             System.out.println("Enter your choice:");
             choice=s.nextInt();
             s.nextLine();
             if(choice==1){
                 Book b=new Book();
                 System.out.println("Enter the book id:");
                 b.setBookID(s.nextLine());
                 System.out.println("Enter the book title:");
                 b.setTitle(s.nextLine());
                 System.out.println("Enter the author name:");
                 b.setAuthor(s.nextLine());
                 System.out.println("Enter the book category:");
                 b.setCategory(s.nextLine());
                 System.out.println("Enter the book price:");
                 b.setPrice(s.nextFloat());
                 bookStore.addBook(b);
             }
             if(choice==2){
            	 System.out.println("All books are");
         		bookStore.displayAll();

             }
             if(choice==3){
            	 try {
                 System.out.println("Enter the author name:");
                 
                 String name=s.nextLine();
                 System.out.println(bookStore.searchByAuthor(name));
            	 }
            	 catch(NoSuchElementException e)
            	 {
            		 System.out.println("No book found by this author");
            	 }
             }
             
             if(choice==4){
                 try {
            	 System.out.println("Enter the title name:");
                 
                 String name=s.nextLine();
                 System.out.println(bookStore.searchByTitle(name));
                 }
                 catch(NoSuchElementException e)
                 {
                	 System.out.println("No book found by this title");
                 }
             }
             
             if(choice==5)
             System.exit(0);
		
		
	}
	}
}
