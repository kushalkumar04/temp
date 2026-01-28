/*
 * This program implements an AI-Driven Resume Screening System
 * using Generic Classes, Bounded Type Parameters, Generic Methods,
 * and Wildcards to process resumes for different job roles safely.
 */

import java.util.*;

// Abstract base class for all job roles
abstract class JobRole {
    String candidateName;

    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    public abstract String getRole();
}

// Different job roles
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String name) {
        super(name);
    }

    public String getRole() {
        return "Software Engineer";
    }
}

class DataScientist extends JobRole {
    public DataScientist(String name) {
        super(name);
    }

    public String getRole() {
        return "Data Scientist";
    }
}

class ProductManager extends JobRole {
    public ProductManager(String name) {
        super(name);
    }

    public String getRole() {
        return "Product Manager";
    }
}

// Generic Resume class with bounded type
class Resume<T extends JobRole> {
    private T role;

    public Resume(T role) {
        this.role = role;
    }

    public T getRole() {
        return role;
    }
}

// Main screening system
public class ResumeScreeningSystem {

    // Wildcard method to screen any type of job role
    public static void screenResumes(List<? extends JobRole> candidates) {
        for (JobRole role : candidates) {
            System.out.println("Screening " + role.candidateName + " for " + role.getRole() + " role.");
        }
    }

    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 = new Resume<>(new SoftwareEngineer("Kushal"));
        Resume<DataScientist> r2 = new Resume<>(new DataScientist("Amit"));
        Resume<ProductManager> r3 = new Resume<>(new ProductManager("Neha"));

        List<JobRole> pipeline = new ArrayList<>();
        pipeline.add(r1.getRole());
        pipeline.add(r2.getRole());
        pipeline.add(r3.getRole());

        screenResumes(pipeline);
    }
}
