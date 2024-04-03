package com.learning.core.day2session1;

public class Book {

	private String book_title;
	private double book_Price;
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String price) {
		this.book_title = price;
	}
	public double getBook_Price() {
		return book_Price;
	}
	public void setBook_Price(double book_Price) {
		this.book_Price = book_Price;
	}
	class BookManager{
		public static Book createBook(String title,Double price) {
			Book book=new Book();
			book.setBook_title(title);
			book.setBook_Price(price);
			
			return book;
			
		}

		public static void showBook(Book book) {
				System.out.println("Book title: "+book.getBook_title()+" and Price: "+book.getBook_Price());			
		}
	}

	

	}


