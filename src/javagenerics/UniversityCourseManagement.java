/*
 * This program implements a Multi-Level University Course Management System
 * using Generic Classes, Bounded Type Parameters, and Wildcards.
 * It manages different course evaluation types and displays them
 * in a type-safe and flexible way.
 */

import java.util.*;

// Abstract base class for course type
abstract class CourseType {
    String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public abstract String getEvaluationType();
}

// Exam based course
class ExamCourse extends CourseType {
    public ExamCourse(String name) {
        super(name);
    }

    public String getEvaluationType() {
        return "Exam Based Evaluation";
    }
}

// Assignment based course
class AssignmentCourse extends CourseType {
    public AssignmentCourse(String name) {
        super(name);
    }

    public String getEvaluationType() {
        return "Assignment Based Evaluation";
    }
}

// Research based course
class ResearchCourse extends CourseType {
    public ResearchCourse(String name) {
        super(name);
    }

    public String getEvaluationType() {
        return "Research Based Evaluation";
    }
}

// Generic Course class with bounded type
class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }
}

// Main class
public class UniversityCourseManagement {

    // Wildcard method to display any type of course
    public static void displayCourses(List<? extends CourseType> list) {
        for (CourseType c : list) {
            System.out.println(c.courseName + " - " + c.getEvaluationType());
        }
    }

    public static void main(String[] args) {

        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Mathematics"));
        examCourses.addCourse(new ExamCourse("Physics"));

        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("Software Engineering"));

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("AI Research"));

        System.out.println("Exam Courses:");
        displayCourses(examCourses.getCourses());

        System.out.println("\nAssignment Courses:");
        displayCourses(assignmentCourses.getCourses());

        System.out.println("\nResearch Courses:");
        displayCourses(researchCourses.getCourses());
    }
}
