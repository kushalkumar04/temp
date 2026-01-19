package coreprogramming.strings.level1;

/*
 * NullPointerExceptionDemo
 * ------------------------
 * This program demonstrates how a NullPointerException occurs
 * and how it can be handled using try-catch.
 */
public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;        // Variable initialized to null
        System.out.println(text.length()); // Calling method on null -> Exception
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;  // Variable initialized to null

        try {
            System.out.println(text.length()); // Risky statement
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught and handled.");
            System.out.println("Reason: You tried to access a method on a null object.");
        }
    }

    public static void main(String[] args) {

        System.out.println("Generating NullPointerException:");

        // This will generate runtime exception
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\nHandling NullPointerException using try-catch:");

        // Refactored code to handle the exception safely
        handleException();
    }
}
