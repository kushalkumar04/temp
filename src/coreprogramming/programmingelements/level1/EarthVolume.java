package coreprogramming.programmingelements.level1;

/*
 * This class calculates the volume of the Earth using the formula for
 * the volume of a sphere. It computes the volume in both cubic kilometers
 * and cubic miles and displays the results.
 */
public class EarthVolume {

    public static void main(String[] args) {

        // Radius of the Earth in kilometers
        double radiusKm = 6378;

        // Value of Pi from the Math library
        double pi = Math.PI;

        // Calculate the volume of the Earth in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Convert radius from kilometers to miles
        double radiusMiles = radiusKm * 0.621371;

        // Calculate the volume of the Earth in cubic miles
        double volumeMiles3 = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);

        // Print the calculated volumes in both units
        System.out.println(
                "The volume of earth in cubic kilometers is " + volumeKm3 +
                        " and cubic miles is " + volumeMiles3
        );
    }
}