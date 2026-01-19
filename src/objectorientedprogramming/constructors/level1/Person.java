package objectorientedprogramming.constructors.level1;

/**
 * Person class with name and age information
 */
public class Person {
    String name;  // Name of the person
    int age;      // Age of the person

    /**
     * Constructor that takes name and age
     */
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Constructor that copies another person's details
     */
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    /**
     * Main method demonstrating copy constructor usage
     * Creates a person and then creates a copy using copy constructor
     */
    public static void main(String[] args) {
        // Create first person with specific details
        Person p1 = new Person("Alice", 30);
        // Create a copy of p1 using copy constructor
        Person p2 = new Person(p1);
        // Display details of the copied person
        System.out.println(p2.name + " " + p2.age);
    }
}