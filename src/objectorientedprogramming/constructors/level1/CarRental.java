package objectorientedprogramming.constructors.level1;

/**
 * CarRental class manages car rental information and calculates rental cost
 */
public class CarRental {
    String customerName;   // Name of the customer renting the car
    String carModel;       // Model of the car being rented
    int rentalDays;        // Number of days for rental

    /**
     * Default constructor that chains to parameterized constructor using this()
     * Initializes with default customer and car information
     */
    CarRental() {
        this("Customer", "Sedan", 1);
    }

    /**
     * Constructor that takes rental details
     */
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    /**
     * Calculates total rental cost
     */
    double calculateTotalCost() {
        return rentalDays * 1000;
    }

    /**
     * Main method demonstrating car rental with cost calculation
     */
    public static void main(String[] args) {
        // Create rental object with customer and car details
        CarRental rental = new CarRental("Emma", "SUV", 5);
        // Calculate and display total rental cost
        System.out.println(rental.calculateTotalCost());
    }
}