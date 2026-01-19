package objectorientedprogramming.constructors.level1;

/**
 * Book class shows how to create objects in different ways
 */
public class Book {
    String title;    // Title of the book
    String author;   // Author of the book
    double price;    // Price of the book

    /**
     * Default constructor creates a book with empty values
     */
    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    /**
     * Constructor that takes book details as input
     */
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    /**
     * Main method demonstrating both constructors
     * Creates books using default and parameterized constructors
     */
    public static void main(String[] args) {
        // Create book with default constructor
        Book b1 = new Book();
        // Create book with parameterized constructor
        Book b2 = new Book("Java Basics", "James", 499.99);
        // Display books created with both constructors
        System.out.println(b1.title + " " + b1.author + " " + b1.price);
        System.out.println(b2.title + " " + b2.author + " " + b2.price);
    }
}