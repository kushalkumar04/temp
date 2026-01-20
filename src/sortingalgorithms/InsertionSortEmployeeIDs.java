package sortingalgorithms;

/*
 * This program demonstrates Insertion Sort to sort
 * employee IDs in ascending order.
 * Insertion Sort works by taking one element at a time
 * and placing it in its correct position in the already
 * sorted part of the array.
 */
public class InsertionSortEmployeeIDs {

    public static void main(String[] args) {

        // Array to store employee IDs
        int[] empIds = {105, 101, 109, 103, 102, 108};

        // Display IDs before sorting
        System.out.println("Employee IDs before sorting:");
        printArray(empIds);

        // Apply Insertion Sort
        insertionSort(empIds);

        // Display IDs after sorting
        System.out.println("\nEmployee IDs after sorting in ascending order:");
        printArray(empIds);
    }

    /*
     * This method performs Insertion Sort on the array.
     * It assumes the first element is already sorted and
     * then inserts each next element into its correct
     * position in the sorted part.
     */
    public static void insertionSort(int[] arr) {

        int n = arr.length;

        // Loop starts from second element as first is already sorted
        for (int i = 1; i < n; i++) {

            // Element to be inserted in the sorted part
            int key = arr[i];
            int j = i - 1;

            // Shift elements of the sorted part to the right
            // until the correct position for key is found
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key at its correct position
            arr[j + 1] = key;
        }
    }

    // Method to print the array elements
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

