package coreprogramming.strings.level1;

import java.util.Scanner;

/*
 * StringComparison
 * ----------------
 * This program compares two strings in two ways:
 * 1. Using a custom method with charAt()
 * 2. Using the built-in equals() method
 * It then checks whether both results are the same.
 */
public class StringComparision {

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String s1, String s2) {

        // If lengths are different, strings are not equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Compare each character using charAt()
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        // All characters matched
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking string inputs
        System.out.print("Enter first string: ");
        String str1 = input.next();

        System.out.print("Enter second string: ");
        String str2 = input.next();

        // Compare using custom method
        boolean resultCharAt = compareUsingCharAt(str1, str2);

        // Compare using built-in equals() method
        boolean resultEquals = str1.equals(str2);

        // Display results
        System.out.println("\nResult using charAt() method : " + resultCharAt);
        System.out.println("Result using equals() method : " + resultEquals);

        // Check if both results are same
        if (resultCharAt == resultEquals) {
            System.out.println("Both comparison results are the same.");
        } else {
            System.out.println("Comparison results are different.");
        }
    }
}
