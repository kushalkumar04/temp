/*
 * This program implements a Personalized Meal Plan Generator
 * using Generic Methods and Bounded Type Parameters.
 * It ensures only valid meal plans (Vegetarian, Vegan, Keto, High-Protein)
 * are created and processed in a type-safe way.
 */

import java.util.*;

// Base interface for all meal plans
interface MealPlan {
    String getPlanType();
}

// Different meal plan types
class VegetarianMeal implements MealPlan {
    public String getPlanType() {
        return "Vegetarian Meal Plan";
    }
}

class VeganMeal implements MealPlan {
    public String getPlanType() {
        return "Vegan Meal Plan";
    }
}

class KetoMeal implements MealPlan {
    public String getPlanType() {
        return "Keto Meal Plan";
    }
}

class HighProteinMeal implements MealPlan {
    public String getPlanType() {
        return "High Protein Meal Plan";
    }
}

// Generic Meal class with bounded type
class Meal<T extends MealPlan> {
    private T plan;

    public Meal(T plan) {
        this.plan = plan;
    }

    public T getPlan() {
        return plan;
    }
}

public class PersonalizedMealPlanGenerator {

    // Generic method to validate and generate meal plan
    public static <T extends MealPlan> void generateMealPlan(T plan) {
        System.out.println("Generating: " + plan.getPlanType());
    }

    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());
        Meal<HighProteinMeal> proteinMeal = new Meal<>(new HighProteinMeal());

        generateMealPlan(vegMeal.getPlan());
        generateMealPlan(veganMeal.getPlan());
        generateMealPlan(ketoMeal.getPlan());
        generateMealPlan(proteinMeal.getPlan());
    }
}
