package coreprogramming.programmingelements.level2;

import java.util.Scanner;

/*
 * This class calculates the area of a triangle in both
 * square centimeters and square inches.
 * It takes the base and height in centimeters as input,
 * computes the area, and converts the values to inches
 * for comparison.
 */
public class TriangleArea {

    public static void main(String[] args) {

        // Create Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Read the base of the triangle in centimeters
        double baseCm = input.nextDouble();

        // Read the height of the triangle in centimeters
        double heightCm = input.nextDouble();

        // Calculate the area in square centimeters using the formula: 1/2 * base * height
        double areaCm = 0.5 * baseCm * heightCm;

        // Convert base and height from centimeters to inches (1 inch = 2.54 cm)
        double baseIn = baseCm / 2.54;
        double heightIn = heightCm / 2.54;

        // Calculate the area in square inches
        double areaIn = 0.5 * baseIn * heightIn;

        // Display the area in both square inches and square centimeters
        System.out.println(
                "The Area of the triangle in sq in is " + areaIn +
                        " and sq cm is " + areaCm
        );

        // Close the Scanner to release system resources
        input.close();
    }
}