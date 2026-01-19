package coreprogramming.strings.level1;

import java.util.Scanner;

/*
 * CharArrayComparison
 * -------------------
 * This program:
 * 1. Takes a string input from the user.
 * 2. Converts the string to a character array using a user-defined method.
 * 3. Converts the string to a character array using built-in toCharArray().
 * 4. Compares both arrays and displays whether they are equal.
 */
public class CharArrayComparison {

    // Method to return characters of a string without using toCharArray()
    public static char[] getCharsUsingCharAt(String text) {
        char[] chars = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }

        return chars;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking string input
        System.out.print("Enter a string: ");
        String text = input.next();

        // Using user-defined method
        char[] customArray = getCharsUsingCharAt(text);

        // Using built-in method
        char[] builtInArray = text.toCharArray();

        // Comparing both arrays
        boolean isSame = compareCharArrays(customArray, builtInArray);

        // Displaying results
        System.out.print("Characters using user-defined method: ");
        for (char c : customArray) {
            System.out.print(c + " ");
        }

        System.out.print("\nCharacters using toCharArray(): ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nAre both character arrays equal? " + isSame);
    }
}
