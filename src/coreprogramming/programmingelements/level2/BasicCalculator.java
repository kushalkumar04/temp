package coreprogramming.programmingelements.level2;

import java.util.Scanner;

/*
 * This class performs basic arithmetic operations on two numbers.
 * It takes two numbers as input from the user and calculates
 * their addition, subtraction, multiplication, and division.
 */
public class BasicCalculator {

    public static void main(String[] args) {

        // Create Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Read two numbers from the user
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();

        // Perform basic arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Display the results of all operations
        System.out.println(
                "The addition, subtraction, multiplication, and division value of 2 numbers " +
                        number1 + " and " + number2 + " is " +
                        addition + ", " + subtraction + ", " +
                        multiplication + ", and " + division
        );

        // Close the Scanner to release system resources
        input.close();
    }
}