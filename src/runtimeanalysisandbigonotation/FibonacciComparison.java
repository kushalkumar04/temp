package runtimeanalysisandbigonotation;

/*
 * This program compares Recursive and Iterative methods
 * for calculating Fibonacci numbers.
 * It shows the difference in time complexity and execution speed.
 * Recursive method is slow for large N, while Iterative is efficient.
 */
public class FibonacciComparison {

    public static void main(String[] args) {

        int n = 30; // Change this to 10, 30, etc.

        long startRec = System.nanoTime();
        int recResult = fibonacciRecursive(n);
        long endRec = System.nanoTime();

        long startItr = System.nanoTime();
        int itrResult = fibonacciIterative(n);
        long endItr = System.nanoTime();

        System.out.println("Fibonacci Number: " + n);
        System.out.println("Recursive Result : " + recResult);
        System.out.println("Recursive Time   : " + (endRec - startRec) + " ns");
        System.out.println("Iterative Result : " + itrResult);
        System.out.println("Iterative Time   : " + (endItr - startItr) + " ns");
    }

    // Recursive Fibonacci (O(2^n))
    public static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci (O(n))
    public static int fibonacciIterative(int n) {
        if (n <= 1)
            return n;

        int a = 0, b = 1, sum = 0;

        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
