import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private static final ArrayList<Book> books = new ArrayList<>();
    private static final ArrayList<Book> borrowedBooks = new ArrayList<>();
    private static HashMap<Book, Double> ratings = new HashMap();
    public static void addBook(Book book)
    {
        books.add(book);
        ratings.put(book,book.getRating());
    }
    public static void displayBooks()
    {
        System.out.println("Displaying all books:");
        for (Book book : books)
        {
            System.out.println("Title: " + book.getTitle() + ", author: " + book.getAuthor() + ", publication year: " + book.getPublicationYear() + ", Review: " + book.getReview());
        }
    }
    public static void findBooksByAuthor(String author)
    {
        for (Book book : books)
        {
            if(author.equals(book.getAuthor()))
            {
                System.out.println("Title: " + book.getTitle() + ", publication year: " + book.getPublicationYear());
            }
        }
    }

    public static void borrowBook(String title)
    {
        for (Book book : books)
        {
            if(title.equals(book.getTitle()))
            {
                System.out.println("Borrowing the book: " + book.getTitle());
                books.remove(book);
                borrowedBooks.add(book);
            }
        }
    }

    public static void returnBook(Book book)
    {
        System.out.println("Returning the book: " + book.getTitle());
        borrowedBooks.remove(book);
        books.add(book);
    }
    public static boolean isBookAvailable(String title)
    {
        for (Book book : books)
        {
            if(book.getTitle().equals(title))
            {
                System.out.println("Book: " + book.getTitle() + " is available.");
                return true;
            }
        }
        return false;
    }

    public double getAverageBookRating()
    {
        double averageRating = 0.00;
        double numberOfRatings = 0.00;
        for (Map.Entry<Book, Double> entry : ratings.entrySet()) {
            Double rating = entry.getValue();
            averageRating += rating;
            numberOfRatings++;
        }
        averageRating = averageRating / numberOfRatings;
        return averageRating;
    }

    public Book getMostReviewedBook() {
        double highestRating = 0.0;
        Book mostReviewedBook = null;

        for (Map.Entry<Book, Double> entry : ratings.entrySet()) {
            Book book = entry.getKey();
            Double rating = entry.getValue();

            if (rating > highestRating) {
                highestRating = rating;
                mostReviewedBook = book;
            }
        }

        return mostReviewedBook;
    }
}

