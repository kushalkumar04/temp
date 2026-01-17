package coreprogramming.programmingelements.level2;

import java.util.Scanner;

/*
 * This class calculates the length of one side of a square
 * when the perimeter is given. It uses the formula:
 * side = perimeter / 4.
 */
public class SquareSide {

    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Read the perimeter of the square
        double perimeter = input.nextDouble();

        // Calculate the length of one side of the square
        double side = perimeter / 4;

        // Print the side length along with the given perimeter
        System.out.println(
                "The length of the side is " + side +
                        " whose perimeter is " + perimeter
        );

        // Close the Scanner to release resources
        input.close();
    }
}