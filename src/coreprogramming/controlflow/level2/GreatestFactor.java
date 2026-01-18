package coreprogramming.controlflow.level2;

import java.util.Scanner;

/*
 * Class Name: GreatestFactor
 *
 * Purpose:
 * This class finds the greatest factor of a given number
 * excluding the number itself.
 *
 * It uses a loop to check divisibility starting from (number - 1)
 * down to 1 and stops as soon as the greatest factor is found.
 */
public class GreatestFactor {

    public static void main(String[] args) {

        // Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Reading the number from the user
        int number = input.nextInt();

        // Variable to store the greatest factor (initialized to 1)
        int greatestFactor = 1;

        // Loop starts from number - 1 and goes down to 1
        for (int i = number - 1; i >= 1; i--) {

            // Check if 'i' perfectly divides the number
            if (number % i == 0) {
                greatestFactor = i; // Assign the greatest factor
                break;              // Exit loop after finding first (greatest) factor
            }
        }

        // Display the result
        System.out.println("The greatest factor of " + number + " besides itself is " + greatestFactor);

        // Close the scanner
        input.close();
    }
}
