package com.thinksworks.librarymanagementsystem.service;

import com.thinksworks.librarymanagementsystem.dto.Book;
import com.thinksworks.librarymanagementsystem.dto.BorrowRecord;
import com.thinksworks.librarymanagementsystem.dto.Member;

public class LibraryService {

    private final static String LIBRARY_NAME = "city Central Library";

    public  void printBookDetails(Book book){
        System.out.println("Book id :"+ book.getBookId());
        System.out.println("title:"+book.getTitle());
        System.out.println("Author :"+book.getAuthor());
        System.out.println("price :"+book.getPrice());
        System.out.println("Stock:"+book.getStock());
    }
    public  void printMemberDetails(Member member){
        System.out.println("----------------------------------");
        System.out.println("Id :"+member.getMemerId());
        System.out.println("name:"+member.getName());
        System.out.println("email:"+member.getEmail());
        System.out.println("membership :"+member.getMembership());
    }
    public  void printBorrowRecordDetails(BorrowRecord borrowRecord) {
        System.out.println("member name:" + borrowRecord.getMember().getName());
        for (Book book : borrowRecord.getBooks()) {
            System.out.println(book.getTitle());
        }
        System.out.println("total borrow is :" + borrowRecord.calculateTotalBorrowValue());
    }
    public double calculateLibraryValue(Book[] books){
        double libraryValue = 0;
        for (Book book : books) {
            libraryValue = libraryValue +(book.getStock() * book.getPrice());
        }
        return libraryValue;
        }
        public void findLowStockBooks(Book[] books){
         for (Book book : books){
             if (book.getStock()<3){
                 System.out.println("title:"+book.getTitle());
             }
         }
        }
    }
