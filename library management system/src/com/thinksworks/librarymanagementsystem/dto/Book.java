package com.thinksworks.librarymanagementsystem.dto;

import com.thinksworks.librarymanagementsystem.enums.BookCategory;

public class Book {

   private int bookId;
   private String title;
   private String author;
   private double price;
   private int stock;
   private BookCategory category;

    static {
        System.out.println("Library System Initialized");
    }
    {
        System.out.println("Book object created");
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Book(int bookId, String title, String author, double price, int stock) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }
    public double calculateStockValue(){
       return price * stock;

    }

}
