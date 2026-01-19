package objectorientedprogramming.constructors.accessmodifiers;



/**
 * BankAccount class shows different ways to access information
 * Some info is public, some is protected, some is private
 */
public class BankAccount {
    public long accountNumber;              // Public: can be accessed by anyone
    protected String accountHolder;         // Protected: accessible by subclasses and within package
    private double balance;                 // Private: hidden from outside, accessed via getter/setter

    /**
     * Constructor that creates an account
     */
    BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    /**
     * Getter method to safely retrieve private balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Setter method to safely modify private balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Main method demonstrating subclass usage and access modifiers
     */
    public static void main(String[] args) {
        // Create SavingsAccount (subclass of BankAccount)
        SavingsAccount sa = new SavingsAccount(555001, "Neha", 25000);
        // Display account information using inherited fields
        sa.displayAccountInfo();
        // Update balance using setter method
        sa.setBalance(30000);
        // Retrieve balance using getter method
        System.out.println(sa.getBalance());
    }
}

/**
 * SavingsAccount class extends BankAccount and inherits access modifiers.
 * Demonstrates inheritance where subclass can access public and protected members.
 */
class SavingsAccount extends BankAccount {
    /**
     * Constructor for savings account calling super() to initialize parent class
     */
    SavingsAccount(long accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);  // Call parent constructor
    }

    /**
     * Displays account information using inherited public and protected members
     */
    void displayAccountInfo() {
        // Can access public accountNumber directly
        // Can access protected accountHolder (inherited)
        // Cannot access private balance directly - must use getter
        System.out.println(accountNumber + " " + accountHolder);
    }
}