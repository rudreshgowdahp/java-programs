package com.thinksworks.librarymanagementsystem.dto;

public class BorrowRecord {
    private int recordId;
     private Member member;
     private Book[] books;
    private int boorowCount;


    public BorrowRecord(int recordId, Member member, Book[] books, int boorowCount) {
        this.recordId = recordId;
        this.member = member;
        this.books = books;
        this.boorowCount = boorowCount;
    }

    public Member getMember() {
        return member;
    }

    public Book[] getBooks() {
        return books;
    }

    public double calculateTotalBorrowValue(){
        double totalBorrowValue = 0;
        for(Book book : books){
            if (book.getStock()>0) {
                totalBorrowValue = totalBorrowValue + book.getPrice();
            }
        }
        return totalBorrowValue;

    }
}
