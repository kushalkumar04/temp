/*
 * This program demonstrates a Smart Warehouse Management System
 * using Generics, Bounded Type Parameters, and Wildcards.
 * It stores different types of items safely and displays them
 * using a common parent type.
 */

import java.util.*;

// Abstract base class
abstract class WarehouseItem {
    String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public abstract String getDetails();
}

// Electronics item
class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }

    public String getDetails() {
        return "Electronics Item: " + name;
    }
}

// Groceries item
class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }

    public String getDetails() {
        return "Grocery Item: " + name;
    }
}

// Furniture item
class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }

    public String getDetails() {
        return "Furniture Item: " + name;
    }
}

// Generic Storage class with bounded type
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

// Main class
public class SmartWarehouse {

    // Wildcard method to display any type of warehouse items
    public static void displayItems(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list) {
            System.out.println(item.getDetails());
        }
    }

    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Mobile"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice"));
        groceriesStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        System.out.println("Electronics:");
        displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries:");
        displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture:");
        displayItems(furnitureStorage.getItems());
    }
}
