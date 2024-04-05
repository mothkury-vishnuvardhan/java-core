package com.learning.core.day2session1;

import com.learning.core.day2session1.Book.BookManager;

public class Main {

	public static void main(String[] args) {
		String title="Java Programmng";
		double price=350.00;
		
		Book book=BookManager.createBook(title, price);
		BookManager.showBook(book);
	}
	 
	 
	}
	


