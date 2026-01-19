package coreprogramming.strings.level1;
import java.util.Scanner;

/*
 * StringIndexOutOfBoundsExceptionDemo
 * ----------------------------------
 * This program demonstrates how StringIndexOutOfBoundsException occurs
 * and how it can be handled using try-catch.
 */
public class StringIndexOutOfBoundsExceptionDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Accessing an index beyond the string length
        System.out.println(text.charAt(text.length())); // This will throw exception
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {

        try {
            // Accessing an invalid index
            System.out.println(text.charAt(text.length()));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught and handled.");
            System.out.println("Reason: Index is outside the valid range of the string.");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking string input
        System.out.print("Enter a string: ");
        String text = input.next();

        System.out.println("\nGenerating StringIndexOutOfBoundsException:");

        // Calling method that generates exception
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\nHandling StringIndexOutOfBoundsException using try-catch:");

        // Calling method that handles exception
        handleException(text);
    }
}
