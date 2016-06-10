package com.newstore.domain;

public class Book {
	private int bookId;
	private String bookName;
	private String author;
	private int yearOfPublish;
	private float price;
	private String genre;
	private String statusOfItem;
	
	public Book(int bookId, String bookName, String author, int yearOfPublish, float price, String genre,
			String statusOfItem) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.yearOfPublish = yearOfPublish;
		this.price = price;
		this.genre = genre;
		this.statusOfItem = statusOfItem;
	}
	
	@Override
	public String toString() {
		return String.format(
				"Book [bookId=%s, bookName=%s, author=%s, yearOfPublish=%s, price=%s, genre=%s, statusOfItem=%s]",
				bookId, bookName, author, yearOfPublish, price, genre, statusOfItem);
	}

	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYearOfPublish() {
		return yearOfPublish;
	}
	public void setYearOfPublish(int yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getStatusOfItem() {
		return statusOfItem;
	}
	public void setStatusOfItem(String statusOfItem) {
		this.statusOfItem = statusOfItem;
	}
}
