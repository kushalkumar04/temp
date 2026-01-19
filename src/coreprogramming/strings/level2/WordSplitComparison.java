package coreprogramming.strings.level2;

import java.util.Scanner;

/*
 * WordSplitComparison
 * -------------------
 * This program splits a sentence into words using:
 * 1. User-defined logic with charAt()
 * 2. Built-in split() method
 * Then it compares both results.
 */
public class WordSplitComparison {

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // Method to split text into words using charAt()
    public static String[] splitUsingCharAt(String text) {

        int length = findLength(text);
        int wordCount = 1;

        // Count spaces to determine number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndex = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[index++] = i;
            }
        }

        // Extract words using indexes
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceIndex.length; i++) {
            words[i] = text.substring(start, spaceIndex[i]);
            start = spaceIndex[i] + 1;
        }

        words[wordCount - 1] = text.substring(start);

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i]))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking sentence input
        System.out.print("Enter a sentence: ");
        String text = input.nextLine();

        // User-defined split
        String[] customWords = splitUsingCharAt(text);

        // Built-in split
        String[] builtInWords = text.split(" ");

        // Compare results
        boolean result = compareArrays(customWords, builtInWords);

        System.out.println("\nWords using charAt():");
        for (String w : customWords) {
            System.out.println(w);
        }

        System.out.println("\nWords using split():");
        for (String w : builtInWords) {
            System.out.println(w);
        }

        System.out.println("\nAre both results same? " + result);
    }
}
