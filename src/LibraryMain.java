public class LibraryMain {

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);
        book1.addReview("Introduction to java programming from basics to the most advanced.");
        book2.addReview("All encompassing and comprehensive book about data structures and algorithms.");
        book3.addReview("Fiction and fact where is the line of difference.");
        book1.setRating(6.5);
        book2.setRating(5.5);
        book3.setRating(9.3);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        System.out.println("-----------------");
        library.displayBooks();
        System.out.println("-----------------");
        System.out.println("Finding book by author!");
        library.findBooksByAuthor("Jane Doe");
        System.out.println("-----------------");
        library.borrowBook("Data Structures and Algorithms");
        System.out.println("-----------------");
        library.displayBooks();
        System.out.println("-----------------");
        library.returnBook(book2);
        System.out.println("-----------------");
        library.displayBooks();
        System.out.println("Checking availability.");
        library.isBookAvailable("The Art of Fiction");
        System.out.println("Showing average rating of books");
        System.out.printf("The average rating: %.1f%n", library.getAverageBookRating());
        System.out.println("Highest rated book title: " + library.getMostReviewedBook().getTitle());


    }
}
