package objectorientedprogramming.constructors.accessmodifiers;

/**
 * Book class shows how to control access to information
 * Some data is public, some is protected, some is hidden
 */
public class Book {
    public String ISBN;              // Public: book identifier accessible to all
    protected String title;          // Protected: accessible in subclasses and package
    private String author;           // Private: hidden, accessed through getter/setter

    /**
     * Constructor that creates a book
     */
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    /**
     * Setter method for private author field
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Getter method for private author field
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Main method demonstrating subclass usage of parent class members
     */
    public static void main(String[] args) {
        // Create EBook (subclass) which inherits access modifiers
        EBook eb = new EBook("978-21", "Java Programming", "John", "PDF");
        // Display details using inherited public and protected fields
        eb.displayEBookDetails();
        // Modify author using inherited setter
        eb.setAuthor("David");
        // Retrieve author using inherited getter
        System.out.println(eb.getAuthor());
    }
}

/**
 * EBook class extends Book and demonstrates inheritance of access modifiers.
 * Shows how subclass can access and use parent's public/protected members.
 */
class EBook extends Book {
    String format;  // Additional property specific to EBook

    /**
     * Constructor for EBook calling super() to initialize parent Book
     */
    EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);  // Call parent constructor
        this.format = format;
    }

    /**
     * Displays EBook details using parent's public and protected members
     * Can directly access ISBN (public) and title (protected)
     * Cannot access author (private) - must use inherited getter
     */
    void displayEBookDetails() {
        System.out.println(ISBN + " " + title + " " + format);
    }
}