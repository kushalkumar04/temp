
package objectorientedprogramming.constructors.accessmodifiers;

/**
 * Student class shows different access levels for student data
 */
public class Student {
    public int rollNumber;       // Public: unique student identifier
    protected String name;       // Protected: accessible in subclasses and package
    private double cgpa;         // Private: academic grades, controlled access

    /**
     * Constructor that creates a student
     */
    Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    /**
     * Getter method for private CGPA field
     */
    public double getCgpa() {
        return cgpa;
    }

    /**
     * Setter method for private CGPA field
     */
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    /**
     * Main method demonstrating postgraduate student (subclass) usage
     */
    public static void main(String[] args) {
        // Create PostgraduateStudent object extending Student
        PostgraduateStudent pg = new PostgraduateStudent(101, "Amit", 8.5, "MTech");
        // Display details using inherited fields
        pg.displayDetails();
        // Update CGPA using inherited setter
        pg.setCgpa(9.1);
        // Retrieve CGPA using inherited getter
        System.out.println(pg.getCgpa());
    }
}

/**
 * PostgraduateStudent class extends Student showing inheritance of access modifiers.
 * Adds specialized attributes for postgraduate-specific information.
 */
class PostgraduateStudent extends Student {
    String course;  // Postgraduate course name (e.g., MTech, MBA)

    /**
     * Constructor for PostgraduateStudent calling super() to initialize parent
     */
    PostgraduateStudent(int rollNumber, String name, double cgpa, String course) {
        super(rollNumber, name, cgpa);  // Call parent constructor
        this.course = course;
    }

    /**
     * Displays postgraduate student details using inherited public/protected members
     * Can access rollNumber (public) and name (protected)
     */
    void displayDetails() {
        System.out.println(rollNumber + " " + name + " " + course);
    }
}
