package objectorientedprogramming.constructors.accessmodifiers;

/**
 * Employee class shows different access levels for employee data
 */
public class Employee {
    public int employeeID;          // Public: employee identifier
    protected String department;    // Protected: accessible in subclasses and package
    private double salary;          // Private: sensitive, accessed via methods

    /**
     * Constructor that creates an employee
     */
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    /**
     * Setter method for private salary field
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Getter method for private salary field
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Main method demonstrating manager (subclass) usage
     */
    public static void main(String[] args) {
        // Create Manager object which extends Employee
        Manager m = new Manager(9001, "IT", 80000);
        // Display manager info using inherited fields
        m.displayManagerInfo();
        // Update salary using inherited setter
        m.setSalary(95000);
        // Retrieve salary using inherited getter
        System.out.println(m.getSalary());
    }
}

/**
 * Manager class extends Employee to show inheritance of access modifiers.
 * Demonstrates how subclass inherits and uses parent's members.
 */
class Manager extends Employee {
    /**
     * Constructor for Manager calling super() for parent initialization
     */
    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);  // Call parent constructor
    }

    /**
     * Displays manager information using inherited public and protected members
     * Can access employeeID (public) and department (protected)
     */
    void displayManagerInfo() {
        System.out.println(employeeID + " " + department);
    }
}