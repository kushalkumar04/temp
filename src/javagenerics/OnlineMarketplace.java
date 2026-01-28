/*
 * This program implements a Dynamic Online Marketplace using Generics.
 * It demonstrates Type Parameters, Generic Methods, and Bounded Type Parameters
 * to manage different product categories like Books, Clothing, and Gadgets
 * in a type-safe manner and apply discounts dynamically.
 */

import java.util.*;

// Category marker interfaces
interface BookCategory {}
interface ClothingCategory {}
interface GadgetCategory {}

// Generic Product class with bounded type
class Product<T> {
    String name;
    double price;
    T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void display() {
        System.out.println("Product: " + name + ", Price: " + price + ", Category: " + category.getClass().getSimpleName());
    }
}

// Example category classes
class Novel implements BookCategory {}
class Shirt implements ClothingCategory {}
class Mobile implements GadgetCategory {}

public class OnlineMarketplace {

    // Generic method with bounded type parameter
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discount = product.price * (percentage / 100);
        product.price -= discount;
        System.out.println("Discount applied. New Price: " + product.price);
    }

    public static void main(String[] args) {

        Product<BookCategory> book = new Product<>("Java Programming", 500, new Novel());
        Product<ClothingCategory> cloth = new Product<>("T-Shirt", 800, new Shirt());
        Product<GadgetCategory> gadget = new Product<>("Smartphone", 20000, new Mobile());

        List<Product<?>> catalog = new ArrayList<>();
        catalog.add(book);
        catalog.add(cloth);
        catalog.add(gadget);

        System.out.println("Before Discount:");
        for (Product<?> p : catalog) {
            p.display();
        }

        System.out.println("\nApplying Discounts:");
        applyDiscount(book, 10);
        applyDiscount(cloth, 20);
        applyDiscount(gadget, 5);

        System.out.println("\nAfter Discount:");
        for (Product<?> p : catalog) {
            p.display();
        }
    }
}
