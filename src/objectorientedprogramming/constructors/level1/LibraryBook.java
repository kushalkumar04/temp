package objectorientedprogramming.constructors.level1;

/**
 * LibraryBook class stores book information and tracks if it's available
 */
public class LibraryBook {
    String title;        // Title of the book
    String author;       // Author name
    double price;        // Price of the book
    boolean available;   // Availability status of the book

    /**
     * Constructor initializing library book with details
     */
    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;  // Book is available when newly created
    }

    /**
     * Borrows the book if it's available
     */
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed");
        } else {
            System.out.println("Book not available");
        }
    }

    /**
     * Main method demonstrating library book operations
     * Creates a book and attempts to borrow it multiple times
     */
    public static void main(String[] args) {
        // Create a library book with details
        LibraryBook book = new LibraryBook("Data Structures", "Mark", 650);
        // First borrow attempt - should succeed
        book.borrowBook();
        // Second borrow attempt - should fail as book is already borrowed
        book.borrowBook();
    }
}