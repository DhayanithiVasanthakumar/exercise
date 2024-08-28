package com.program.constructor.constructoroverloading;

/*
  Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:

One constructor takes title and author as parameters.
The other constructor takes title, author, and price as parameters.
Print the values of the variables for each constructor.
 */


public class BookDetails {
	private String title;
	private String author;
	private int price;
	
	
	public BookDetails(String title,String author) {
		this.title=title;
		this.author=author;
	}
	
	public BookDetails(String title,String author,int price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}
	//title
	public String getTitle() {
		return title;
	}
	public String setTitle() {
		return title;
	}
	//author
	public String getAuthor() {
		return author;
	}
	public String setAuthor() {
		return author;
	}
	//price
	public int getPrice() {
		return price;
	}
	public int setPrice() {
		return price;
	}
	
	public void bookDetails() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}
}
