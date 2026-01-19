package objectorientedprogramming.constructors.instance;

/**
 * Course class shows the difference between shared and individual data
 * Each course has its own name, duration, fee
 * But all courses share the same institution name
 */
public class Course {
    String courseName;                   // Instance variable: unique per course object
    int duration;                        // Instance variable: unique per course object
    double fee;                          // Instance variable: unique per course object
    static String instituteName = "Tech Academy";  // Static variable: SHARED by all Course instances

    /**
     * Constructor that creates a course
     */
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    /**
     * Displays course details including both instance and static variables
     */
    void displayCourseDetails() {
        System.out.println(courseName + " " + duration + " " + fee + " " + instituteName);
    }

    /**
     * Updates the institution name for all courses
     */
    static void updateInstituteName(String name) {
        instituteName = name;
    }

    /**
     * Main method demonstrating static vs instance variables
     */
    public static void main(String[] args) {
        // Create first course with instance variables
        Course c1 = new Course("Java", 6, 12000);
        // Create second course with different instance variables
        Course c2 = new Course("Python", 4, 10000);

        // Display c1 - shows Java course with original institution name
        c1.displayCourseDetails();

        // Update static variable through class method
        // This change affects ALL instances including c2
        Course.updateInstituteName("Global Learning");

        // Display c2 - now shows Python course with NEW institution name (because it's static)
        c2.displayCourseDetails();
    }
}