package runtimeanalysisandbigonotation;

/*
 * This program compares the performance of String, StringBuilder,
 * and StringBuffer for concatenating a large number of strings.
 *
 * Objective:
 * To show why String concatenation is slow (O(N^2)) due to immutability,
 * while StringBuilder and StringBuffer are fast (O(N)) because they are mutable.
 *
 * The program appends the word "hello" one million times using:
 * 1. String        - Creates a new object every time (very slow)
 * 2. StringBuilder - Fast, mutable, not thread-safe
 * 3. StringBuffer  - Thread-safe, slightly slower than StringBuilder
 *
 * Execution time is measured using System.nanoTime().
 * This clearly demonstrates that StringBuilder and StringBuffer
 * are much more efficient than String for large-scale concatenation.
 */
public class StringConcatenationPerformance {

    public static void main(String[] args) {

        int n = 1_000_000;

        // -------- Using String (O(N^2)) --------
        long startString = System.nanoTime();
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + "hello";
        }
        long endString = System.nanoTime();

        // -------- Using StringBuilder (O(N)) --------
        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }
        long endBuilder = System.nanoTime();

        // -------- Using StringBuffer (O(N)) --------
        long startBuffer = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbuf.append("hello");
        }
        long endBuffer = System.nanoTime();

        // Display results
        System.out.println("String Time       : " + (endString - startString) + " ns");
        System.out.println("StringBuilder Time: " + (endBuilder - startBuilder) + " ns");
        System.out.println("StringBuffer Time : " + (endBuffer - startBuffer) + " ns");
    }
}
