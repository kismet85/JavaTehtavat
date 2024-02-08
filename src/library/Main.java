package library;

import library.model.Book;
import library.model.LibraryMember;
import library.system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");
        Book book3 = new Book("1984", "George Orwell", "9780451524935");
        Book book4 = new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488");
        Book book5 = new Book("Pride and Prejudice", "Jane Austen", "9780486284736");


        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        LibraryMember member1 = new LibraryMember("Ismet");
        LibraryMember member2 = new LibraryMember("Samuli");
        LibraryMember member3 = new LibraryMember("Stefanos");

        library.addMember(member1);
        library.addMember(member2);
        library.addMember(member3);

        library.borrowBook(member1, book1);
        library.borrowBook(member1, book2);
        library.borrowBook(member1, book3);
        library.borrowBook(member3, book4);
        library.borrowBook(member3, book5);
        library.reserveBook(member2, book2);
        library.reserveBook(member2, book3);
        library.reserveBook(member2, book4);

        System.out.println("Books borrowed by " + member1.getName() + " with id " + member1.getMemberId() + ":" );
        for (Book book : member1.getBorrowedBooks()) {
            System.out.println(book.getTitle());
        }
        System.out.println("Books borrowed by " + member2.getName() + " with id " + member2.getMemberId() + ":" );
        for (Book book : member2.getBorrowedBooks()) {
            System.out.println(book.getTitle());
        }
        System.out.println("Books borrowed by " + member3.getName() + " with id " + member3.getMemberId() + ":" );
        for (Book book : member3.getBorrowedBooks()) {
            System.out.println(book.getTitle());
        }

        System.out.println("Books reserved by " + member1.getName() + " with id " + member1.getMemberId() + ":" );
        for (Book book : member1.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
        System.out.println("Books reserved by " + member2.getName() + " with id " + member2.getMemberId() + ":" );
        for (Book book : member2.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
        System.out.println("Books reserved by " + member3.getName() + " with id " + member3.getMemberId() + ":" );
        for (Book book : member3.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
    }
}