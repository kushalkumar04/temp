package coreprogramming.programmingelements.level2;

import java.util.Scanner;

/*
 * This class converts a distance given in feet into yards and miles.
 * It takes the input in feet, performs unit conversions, and prints
 * the equivalent distances in yards and miles.
 */
public class DistanceConversion {

    public static void main(String[] args) {

        // Create Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Read the distance in feet
        double feet = input.nextDouble();

        // Convert feet to yards (1 yard = 3 feet)
        double yards = feet / 3;

        // Convert yards to miles (1 mile = 1760 yards)
        double miles = yards / 1760;

        // Display the converted distances
        System.out.println(
                "The distance in yards is " + yards +
                        " while the distance in miles is " + miles
        );

        // Close the Scanner to release system resources
        input.close();
    }
}