package coreprogramming.strings.level2;

import java.util.Scanner;

/*
 * VowelConsonantCounter
 * --------------------
 * This program finds the number of vowels and consonants in a given string.
 * It uses ASCII values to convert uppercase letters to lowercase and
 * checks each character using charAt().
 */
public class VowelConsonantCounter {

    // Method to check if a character is Vowel, Consonant, or Not a Letter
    public static String checkCharacter(char ch) {

        // Convert uppercase to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {

            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to count vowels and consonants in a string
    // Returns array: result[0] = vowel count, result[1] = consonant count
    public static int[] countVowelsAndConsonants(String text) {

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            String result = checkCharacter(ch);

            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Calling method
        int[] result = countVowelsAndConsonants(text);

        // Displaying result
        System.out.println("Number of Vowels     = " + result[0]);
        System.out.println("Number of Consonants = " + result[1]);
    }
}

