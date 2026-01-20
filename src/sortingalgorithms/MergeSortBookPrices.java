package sortingalgorithms;
/*
 * This program demonstrates Merge Sort to sort
 * an array of book prices in ascending order.
 * Merge Sort works by dividing the array into halves,
 * sorting each half, and then merging them back together.
 */
public class MergeSortBookPrices {

    public static void main(String[] args) {

        // Array to store book prices
        double[] prices = {450.50, 299.99, 799.00, 150.75, 999.25, 320.40};

        // Display prices before sorting
        System.out.println("Book prices before sorting:");
        printArray(prices);

        // Apply Merge Sort
        mergeSort(prices, 0, prices.length - 1);

        // Display prices after sorting
        System.out.println("\nBook prices after sorting in ascending order:");
        printArray(prices);
    }

    /*
     * This method recursively divides the array into two halves
     * and sorts each half.
     */
    public static void mergeSort(double[] arr, int left, int right) {

        if (left < right) {

            // Find the middle index
            int mid = (left + right) / 2;

            // Sort first half
            mergeSort(arr, left, mid);

            // Sort second half
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    /*
     * This method merges two sorted subarrays into one sorted array.
     */
    public static void merge(double[] arr, int left, int mid, int right) {

        // Sizes of the two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        double[] leftArray = new double[n1];
        double[] rightArray = new double[n2];

        // Copy data into temporary arrays
        for (int i = 0; i < n1; i++)
            leftArray[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            rightArray[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge the temporary arrays back into main array
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray (if any)
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray (if any)
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Method to print array elements
    public static void printArray(double[] arr) {
        for (double value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
