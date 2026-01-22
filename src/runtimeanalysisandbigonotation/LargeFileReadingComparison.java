package runtimeanalysisandbigonotation;

/*
 * This program compares the performance of FileReader and InputStreamReader
 * while reading a large file.
 * It measures the time taken by both approaches and
 * shows that InputStreamReader is generally faster for large files.
 */
import java.io.*;

public class LargeFileReadingComparison {

    public static void main(String[] args) {

        String filePath = "largefile.txt"; // Path of large file

        // -------- Using FileReader --------
        try {
            long startFR = System.nanoTime();

            BufferedReader fr = new BufferedReader(new FileReader(filePath));
            while (fr.readLine() != null) {
                // Reading file
            }
            fr.close();

            long endFR = System.nanoTime();
            System.out.println("FileReader Time: " + (endFR - startFR) + " ns");

        } catch (IOException e) {
            System.out.println("FileReader Error: " + e.getMessage());
        }

        // -------- Using InputStreamReader --------
        try {
            long startISR = System.nanoTime();

            BufferedReader isr = new BufferedReader(
                    new InputStreamReader(new FileInputStream(filePath), "UTF-8")
            );
            while (isr.readLine() != null) {
                // Reading file
            }
            isr.close();

            long endISR = System.nanoTime();
            System.out.println("InputStreamReader Time: " + (endISR - startISR) + " ns");

        } catch (IOException e) {
            System.out.println("InputStreamReader Error: " + e.getMessage());
        }
    }
}
