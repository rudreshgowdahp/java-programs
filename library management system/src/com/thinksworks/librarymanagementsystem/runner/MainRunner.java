package com.thinksworks.librarymanagementsystem.runner;

import com.thinksworks.librarymanagementsystem.dto.Book;
import com.thinksworks.librarymanagementsystem.dto.BorrowRecord;
import com.thinksworks.librarymanagementsystem.dto.Member;
import com.thinksworks.librarymanagementsystem.enums.BookCategory;
import com.thinksworks.librarymanagementsystem.enums.MemberShipType;
import com.thinksworks.librarymanagementsystem.service.LibraryService;

public class MainRunner {
    public static void main(String[] args) {


        Book book = new Book(1, "Java", "Rudresh", 67, 5, BookCategory.NONFICTION);
        Book book1 = new Book(2, "python", "Gagan", 20, 3, BookCategory.FICTION);
        Book book2 = new Book(3, "C", "Pavan", 50, 2, BookCategory.HISTORY);
        Book book3 = new Book(4, "C++", "Harsha", 40, 5, BookCategory.TECHNOLOGY);
        Book book4 = new Book(5, "HTML", "Manoj", 6, 5, BookCategory.SCIENCE);

        Book[] books = {book, book1, book2, book3, book4};

        Member member = new Member(1, "xyz", "xyz@gmail.com", MemberShipType.PREMIUM);
        BorrowRecord borrowRecord = new BorrowRecord(1, member, books, 2);
        LibraryService libraryService = new LibraryService();
        for (Book b1 : books) {
            libraryService.printBookDetails(book);
            libraryService.printMemberDetails(member);
            libraryService.printBorrowRecordDetails(borrowRecord);
            libraryService.calculateLibraryValue(books);
            libraryService.findLowStockBooks(books);

        }
    }
}







