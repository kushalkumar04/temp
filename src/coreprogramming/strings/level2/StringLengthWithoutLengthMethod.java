package coreprogramming.strings.level2;

import java.util.Scanner;

/*
 * StringLengthWithoutLengthMethod
 * --------------------------------
 * This program finds the length of a string without using the built-in
 * length() method by accessing characters until an exception occurs.
 */
public class StringLengthWithoutLengthMethod {

    // Method to find length without using length()
    public static int findLength(String text) {

        int count = 0;

        try {
            // Infinite loop to access characters
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when index goes out of range
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a string: ");
        String text = input.next();

        // Using user-defined method
        int customLength = findLength(text);

        // Using built-in method
        int builtInLength = text.length();

        // Display results
        System.out.println("Length using user-defined method = " + customLength);
        System.out.println("Length using built-in length()   = " + builtInLength);
    }
}
