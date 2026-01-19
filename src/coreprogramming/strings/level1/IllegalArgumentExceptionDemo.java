package coreprogramming.strings.level1;

import java.util.Scanner;

/*
 * IllegalArgumentExceptionDemo
 * ----------------------------
 * This program demonstrates how IllegalArgumentException occurs
 * when substring() is called with start index greater than end index,
 * and how it can be handled using try-catch.
 */
public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        // Start index is greater than end index
        System.out.println(text.substring(5, 2));  // This will throw exception
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {

        try {
            // Invalid substring range
            System.out.println(text.substring(5, 2));
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught and handled.");
            System.out.println("Reason: Start index is greater than End index.");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking string input
        System.out.print("Enter a string: ");
        String text = input.next();

        System.out.println("\nGenerating IllegalArgumentException:");

        // Calling method that generates exception
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\nHandling IllegalArgumentException using try-catch:");

        // Calling method that handles exception
        handleException(text);
    }
}
