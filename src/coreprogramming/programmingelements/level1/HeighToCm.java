package coreprogramming.programmingelements.level1;

import java.util.Scanner;

/*
 * This class converts a person's height from centimeters into
 * feet and inches. It takes the height in centimeters as input
 * and performs the necessary unit conversions.
 */
public class HeighToCm {

    public static void main(String[] args) {

        // Create Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Read height in centimeters
        double heightCm = input.nextDouble();

        // Convert centimeters to total inches (1 inch = 2.54 cm)
        double totalInches = heightCm / 2.54;

        // Calculate feet from total inches (1 foot = 12 inches)
        int feet = (int) (totalInches / 12);

        // Calculate remaining inches
        double inches = totalInches % 12;

        // Display the height in centimeters, feet, and inches
        System.out.println(
                "Your Height in cm is " + heightCm +
                        " while in feet is " + feet +
                        " and inches is " + inches
        );

        // Close the Scanner to release resources
        input.close();
    }
}