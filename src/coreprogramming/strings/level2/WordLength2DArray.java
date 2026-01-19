package coreprogramming.strings.level2;

import java.util.Scanner;

/*
 * WordLength2DArray
 * -----------------
 * This program splits a sentence into words without using split(),
 * finds length of each word without using length(),
 * and stores word and its length in a 2D array.
 */
public class WordLength2DArray {

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

        // Count spaces
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
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

    // Method to create 2D array with word and its length
    public static String[][] createWordLengthTable(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int length = findLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(length);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = input.nextLine();

        // Split words
        String[] words = splitUsingCharAt(text);

        // Create 2D array of word and length
        String[][] wordLengthTable = createWordLengthTable(words);

        // Display in tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("------------------------");

        for (int i = 0; i < wordLengthTable.length; i++) {
            String word = wordLengthTable[i][0];
            int length = Integer.parseInt(wordLengthTable[i][1]);
            System.out.println(word + "\t\t" + length);
        }
    }
}

