package sortingalgorithms;

/*
 * This program demonstrates Quick Sort to sort
 * an array of product prices in ascending order.
 * Quick Sort works by selecting a pivot element,
 * partitioning the array around the pivot, and
 * recursively sorting the subarrays.
 */
public class QuickSortProductPrices {

    public static void main(String[] args) {

        // Array to store product prices
        double[] prices = {1200.50, 450.99, 899.00, 1500.75, 299.40, 999.99};

        // Display prices before sorting
        System.out.println("Product prices before sorting:");
        printArray(prices);

        // Apply Quick Sort
        quickSort(prices, 0, prices.length - 1);

        // Display prices after sorting
        System.out.println("\nProduct prices after sorting in ascending order:");
        printArray(prices);
    }

    /*
     * This method applies Quick Sort recursively on the array.
     */
    public static void quickSort(double[] arr, int low, int high) {

        if (low < high) {

            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort elements before pivot
            quickSort(arr, low, pivotIndex - 1);

            // Recursively sort elements after pivot
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    /*
     * This method partitions the array using the last element as pivot.
     * It places the pivot at its correct position and
     * rearranges smaller elements to the left and larger to the right.
     */
    public static int partition(double[] arr, int low, int high) {

        double pivot = arr[high];   // Choose last element as pivot
        int i = low - 1;            // Index of smaller element

        for (int j = low; j < high; j++) {

            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in its correct position
        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;   // Return pivot index
    }

    // Method to print array elements
    public static void printArray(double[] arr) {
        for (double value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}


