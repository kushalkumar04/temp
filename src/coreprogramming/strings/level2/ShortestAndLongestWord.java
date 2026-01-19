package coreprogramming.strings.level2;

import java.util.Scanner;

/*
 * ShortestAndLongestWord
 * ----------------------
 * This program splits a sentence into words without using split(),
 * finds the length of each word without using length(),
 * stores word and length in a 2D array,
 * and finally finds the shortest and longest words.
 */
public class ShortestAndLongestWord {

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

        int len = findLength(text);
        int wordCount = 1;

        // Count spaces to know number of words
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space positions
        int[] spaceIndex = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[index++] = i;
            }
        }

        // Extract words
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceIndex.length; i++) {
            words[i] = text.substring(start, spaceIndex[i]);
            start = spaceIndex[i] + 1;
        }

        words[wordCount - 1] = text.substring(start);

        return words;
    }

    // Method to create 2D array of word and its length
    public static String[][] createWordLengthTable(String[] words) {

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int length = findLength(words[i]);
            table[i][0] = words[i];
            table[i][1] = String.valueOf(length);
        }

        return table;
    }

    // Method to find shortest and longest word indexes
    // Returns: [indexOfShortest, indexOfLongest]
    public static int[] findShortestAndLongest(String[][] table) {

        int minIndex = 0;
        int maxIndex = 0;

        int minLength = Integer.parseInt(table[0][1]);
        int maxLength = Integer.parseInt(table[0][1]);

        for (int i = 1; i < table.length; i++) {

            int currentLength = Integer.parseInt(table[i][1]);

            if (currentLength < minLength) {
                minLength = currentLength;
                minIndex = i;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = input.nextLine();

        // Step 1: Split words
        String[] words = splitUsingCharAt(text);

        // Step 2: Create 2D array (word, length)
        String[][] table = createWordLengthTable(words);

        // Step 3: Find shortest and longest
        int[] result = findShortestAndLongest(table);

        int shortestIndex = result[0];
        int longestIndex = result[1];

        // Display table
        System.out.println("\nWord\t\tLength");
        System.out.println("-------------------------");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }

        // Display final result
        System.out.println("\nShortest Word : " + table[shortestIndex][0] +
                " (Length = " + table[shortestIndex][1] + ")");
        System.out.println("Longest Word  : " + table[longestIndex][0] +
                " (Length = " + table[longestIndex][1] + ")");
    }
}
