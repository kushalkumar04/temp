package coreprogramming.strings.level1;

import java.util.Scanner;

/*
 * SubstringComparison
 * -------------------
 * This program creates a substring in two ways:
 * 1. Using charAt() method manually
 * 2. Using built-in substring() method
 * Then it compares both substrings using charAt() comparison.
 */
public class SubstringComparison {

    // Method to create substring using charAt()
    public static String createSubstringUsingCharAt(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter a string: ");
        String text = input.next();

        System.out.print("Enter start index: ");
        int start = input.nextInt();

        System.out.print("Enter end index: ");
        int end = input.nextInt();

        // Substring using charAt()
        String customSubstring = createSubstringUsingCharAt(text, start, end);

        // Substring using built-in method
        String builtInSubstring = text.substring(start, end);

        // Compare both substrings
        boolean isSame = compareStringsUsingCharAt(customSubstring, builtInSubstring);

        // Display results
        System.out.println("\nSubstring using charAt(): " + customSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Are both substrings equal? " + isSame);
    }
}
