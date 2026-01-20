package sortingalgorithms;

/*
 * This program demonstrates Bubble Sort to sort
 * student marks in ascending order.
 * Bubble Sort works by repeatedly comparing adjacent
 * elements and swapping them if they are in the wrong order.
 */
public class BubbleSortStudentMarks {

    public static void main(String[] args) {

        // Array to store student marks
        int[] marks = {78, 45, 90, 62, 88, 55};

        // Display marks before sorting
        System.out.println("Marks before sorting:");
        printArray(marks);

        // Apply Bubble Sort
        bubbleSort(marks);

        // Display marks after sorting
        System.out.println("\nMarks after sorting in ascending order:");
        printArray(marks);
    }

    /*
     * This method performs Bubble Sort on the array.
     * It compares adjacent elements and swaps them if
     * they are in the wrong order.
     */
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        // Outer loop for number of passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {

                // If current element is greater than next, swap them
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to print array elements
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}


