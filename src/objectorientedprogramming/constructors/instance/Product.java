
package objectorientedprogramming.constructors.instance;

/**
 * Product class shows how to count total products created
 * Each product has its own name and price
 * But total count is shared by all products
 */
public class Product {
    String productName;              // Instance variable: unique per product
    double price;                    // Instance variable: unique per product
    static int totalProducts = 0;    // Static variable: shared counter for ALL products

    /**
     * Constructor that creates a product and counts it
     */
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // Increment the shared static counter
    }

    /**
     * Displays details of this individual product
     * Shows the instance variables specific to this product
     */
    void displayProductDetails() {
        System.out.println(productName + " " + price);
    }

    /**
     * Static method to display total number of products created
     * Accessed via class name (Product.displayTotalProducts())
     * Shows the value of the static totalProducts variable
     */
    static void displayTotalProducts() {
        System.out.println(totalProducts);
    }

    /**
     * Main method demonstrating static counter with instances
     */
    public static void main(String[] args) {
        // Create first product - totalProducts becomes 1
        Product p1 = new Product("Laptop", 75000);
        // Create second product - totalProducts becomes 2
        Product p2 = new Product("Phone", 35000);

        // Display individual product details (instance variables)
        p1.displayProductDetails();
        p2.displayProductDetails();

        // Display total products created (static variable)
        // Both p1 and p2 contribute to this same static counter
        Product.displayTotalProducts();
    }
}
