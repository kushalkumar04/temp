
package objectorientedprogramming.constructors.instance;

/**
 * Vehicle class shows how to share data across all vehicles
 * Each vehicle has its own owner and type
 * But registration fee is the same for all vehicles
 */
public class Vehicle {
    String ownerName;                       // Instance variable: unique owner per vehicle
    String vehicleType;                     // Instance variable: unique type per vehicle
    static double registrationFee = 5000;   // Static variable: same fee applies to all vehicles

    /**
     * Constructor that creates a vehicle
     */
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    /**
     * Displays vehicle details including both instance and static information
     */
    void displayVehicleDetails() {
        System.out.println(ownerName + " " + vehicleType + " " + registrationFee);
    }

    /**
     * Updates the registration fee for all vehicles
     */
    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    /**
     * Main method demonstrating static variable behavior
     */
    public static void main(String[] args) {
        // Create first vehicle with instance variables
        Vehicle v1 = new Vehicle("Rahul", "Car");
        // Create second vehicle with different instance variables
        Vehicle v2 = new Vehicle("Anita", "Bike");

        // Display v1 with original registration fee
        v1.displayVehicleDetails();

        // Update static registration fee - applies to ALL vehicles
        Vehicle.updateRegistrationFee(6500);

        // Display v2 - now shows updated registration fee (because it's static/shared)
        v2.displayVehicleDetails();
    }
}
