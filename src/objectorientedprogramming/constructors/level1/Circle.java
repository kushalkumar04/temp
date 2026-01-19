package objectorientedprogramming.constructors.level1;

/**
 * Circle class with radius and methods to calculate area
 */
public class Circle {
    double radius;  // Radius of the circle

    /**
     * Default constructor that chains to parameterized constructor
     * Sets default radius to 1.0
     */
    Circle() {
        this(1.0);
    }

    /**
     * Constructor that takes a radius value
     */
    Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Main method demonstrating both constructors
     * Creates circles with default and specified radius values
     */
    public static void main(String[] args) {
        // Create circle with default constructor (radius = 1.0)
        Circle c1 = new Circle();
        // Create circle with parameterized constructor (radius = 5.5)
        Circle c2 = new Circle(5.5);
        // Display radius values
        System.out.println(c1.radius);
        System.out.println(c2.radius);
    }
}