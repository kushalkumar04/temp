package sortingalgorithms;

/*
 * This program demonstrates Heap Sort to sort
 * expected salary demands in ascending order.
 * Heap Sort works by first building a Max Heap,
 * then repeatedly extracting the maximum element
 * and placing it at the end of the array.
 */
public class HeapSortSalary {

    public static void main(String[] args) {

        // Array to store expected salary demands
        int[] salaries = {45000, 60000, 35000, 80000, 50000, 70000};

        // Display salaries before sorting
        System.out.println("Salary demands before sorting:");
        printArray(salaries);

        // Apply Heap Sort
        heapSort(salaries);

        // Display salaries after sorting
        System.out.println("\nSalary demands after sorting in ascending order:");
        printArray(salaries);
    }

    /*
     * This method performs Heap Sort on the array.
     */
    public static void heapSort(int[] arr) {

        int n = arr.length;

        // Step 1: Build a Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }


        // Step 2: Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {

            // Move current root (largest) to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    /*
     * This method maintains the Max Heap property
     * for a subtree rooted at index i.
     */
    public static void heapify(int[] arr, int heapSize, int i) {

        int largest = i;         // Initialize largest as root
        int left = 2 * i + 1;    // Left child index
        int right = 2 * i + 2;   // Right child index

        // If left child is larger than root
        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {

            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(arr, heapSize, largest);
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
