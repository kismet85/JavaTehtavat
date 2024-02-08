package library.system;

import library.model.Book;
import library.model.LibraryMember;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<LibraryMember> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }
    public void borrowBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            member.borrowBook(book);
            book.setReserved(true);
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        member.returnBook(book);
        book.setReserved(false);
    }

    public void reserveBook(LibraryMember member, Book book) {
        member.reserveBook(book);
    }

    public void cancelReservation(LibraryMember member, Book book) {
        member.cancelReservation(book);
    }
}