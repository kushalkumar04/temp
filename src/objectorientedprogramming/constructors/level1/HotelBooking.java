package objectorientedprogramming.constructors.level1;

/**
 * HotelBooking class manages hotel booking information
 */
public class HotelBooking {
    String guestName;   // Name of the guest
    String roomType;    // Type of room (Standard, Deluxe, etc.)
    int nights;         // Number of nights for stay

    /**
     * Default constructor that chains to parameterized constructor
     * Initializes booking with default values
     */
    HotelBooking() {
        this("Guest", "Standard", 1);
    }

    /**
     * Constructor that takes booking details
     */
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    /**
     * Constructor that copies another booking's details
     */
    HotelBooking(HotelBooking hb) {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }

    /**
     * Main method demonstrating all three constructor types
     * Creates bookings using default, parameterized, and copy constructors
     */
    public static void main(String[] args) {
        // Create booking with default constructor
        HotelBooking h1 = new HotelBooking();
        // Create booking with parameterized constructor
        HotelBooking h2 = new HotelBooking("John", "Deluxe", 3);
        // Create a copy of h2 using copy constructor
        HotelBooking h3 = new HotelBooking(h2);
        // Display details of copied booking
        System.out.println(h3.guestName + " " + h3.roomType + " " + h3.nights);
    }
}