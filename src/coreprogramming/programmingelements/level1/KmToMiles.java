package coreprogramming.programmingelements.level1;

/*
 * This class converts a distance from kilometers to miles.
 * It uses a fixed conversion factor and prints the converted value.
 */
public class KmToMiles {

    public static void main(String[] args) {

        // Distance in kilometers
        double kilometers = 10.8;

        // Convert kilometers to miles (1 mile ≈ 1.6 km as per given formula)
        double miles = kilometers * 1.6;

        // Display the result
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}