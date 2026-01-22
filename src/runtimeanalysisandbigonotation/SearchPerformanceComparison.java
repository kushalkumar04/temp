package runtimeanalysisandbigonotation;

/*
 * This program compares the performance of Linear Search and Binary Search
 * on large datasets. It creates arrays of different sizes and measures
 * the time taken by each search algorithm to find a target element.
 *
 * Linear Search scans elements one by one (O(N)).
 * Binary Search divides the search space in half each time (O(log N)),
 * assuming the array is already sorted.
 *
 * The program uses System.nanoTime() to record execution time and
 * demonstrates that Binary Search is significantly faster for
 * large datasets compared to Linear Search.
 */
public class SearchPerformanceComparison {

    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 1000000};
        int target = -1; // Worst case: element not present

        for (int size : sizes) {

            // Create dataset
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = i * 2; // Sorted array of even numbers
            }

            // -------- Linear Search Timing --------
            long startLinear = System.nanoTime();
            linearSearch(arr, target);
            long endLinear = System.nanoTime();
            long linearTime = endLinear - startLinear;

            // -------- Binary Search Timing --------
            long startBinary = System.nanoTime();
            binarySearch(arr, target);
            long endBinary = System.nanoTime();
            long binaryTime = endBinary - startBinary;

            // Print results
            System.out.println("Dataset Size: " + size);
            System.out.println("Linear Search Time  : " + linearTime + " ns");
            System.out.println("Binary Search Time : " + binaryTime + " ns");
            System.out.println("------------------------------------");
        }
    }

    // Linear Search: O(N)
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search: O(log N)
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}

