package runtimeanalysisandbigonotation;

/*
 * This program compares the performance of three sorting algorithms:
 * 1. Bubble Sort  - O(N^2) time complexity (very slow for large datasets)
 * 2. Merge Sort   - O(N log N) time complexity (stable and efficient)
 * 3. Quick Sort   - O(N log N) average time complexity (fast but unstable)
 *
 * The program generates arrays of different sizes, applies each sorting
 * algorithm, and measures the execution time using System.nanoTime().
 * This demonstrates why Bubble Sort is impractical for large datasets,
 * while Merge Sort and Quick Sort scale efficiently.
 */
import java.util.Random;
import java.util.Arrays;

public class SortingPerformanceComparison {

    public static void main(String[] args) {

        int[] sizes = {1000, 10000}; // (Avoid 1,000,000 for Bubble Sort due to huge time)

        for (int size : sizes) {

            int[] original = generateArray(size);

            int[] bubbleArray = original.clone();
            int[] mergeArray = original.clone();
            int[] quickArray = original.clone();

            // Bubble Sort Timing
            long startBubble = System.nanoTime();
            bubbleSort(bubbleArray);
            long endBubble = System.nanoTime();

            // Merge Sort Timing
            long startMerge = System.nanoTime();
            mergeSort(mergeArray, 0, mergeArray.length - 1);
            long endMerge = System.nanoTime();

            // Quick Sort Timing
            long startQuick = System.nanoTime();
            quickSort(quickArray, 0, quickArray.length - 1);
            long endQuick = System.nanoTime();

            System.out.println("Dataset Size: " + size);
            System.out.println("Bubble Sort Time : " + (endBubble - startBubble) + " ns");
            System.out.println("Merge Sort Time  : " + (endMerge - startMerge) + " ns");
            System.out.println("Quick Sort Time  : " + (endQuick - startQuick) + " ns");
            System.out.println("----------------------------------------");
        }
    }

    // Generate random array
    private static int[] generateArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100000);
        }
        return arr;
    }

    // Bubble Sort
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Merge Sort
    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] L = Arrays.copyOfRange(arr, left, mid + 1);
        int[] R = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left;

        while (i < L.length && j < R.length) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }

        while (i < L.length) arr[k++] = L[i++];
        while (j < R.length) arr[k++] = R[j++];
    }

    // Quick Sort
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
