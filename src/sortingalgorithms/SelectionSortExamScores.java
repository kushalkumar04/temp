package sortingalgorithms;

/*
 * This program demonstrates Selection Sort to sort
 * students' exam scores in ascending order.
 * Selection Sort works by repeatedly finding the
 * minimum element from the unsorted part of the array
 * and placing it at the beginning.
 */
public class SelectionSortExamScores {

    public static void main(String[] args) {

        // Array to store exam scores
        int[] scores = {78, 45, 92, 60, 85, 70};

        // Display scores before sorting
        System.out.println("Exam scores before sorting:");
        printArray(scores);

        // Apply Selection Sort
        selectionSort(scores);

        // Display scores after sorting
        System.out.println("\nExam scores after sorting in ascending order:");
        printArray(scores);
    }

    /*
     * This method performs Selection Sort on the array.
     * It selects the smallest element from the unsorted part
     * and swaps it with the first element of that part.
     */
    public static void selectionSort(int[] arr) {

        int n = arr.length;

        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {

            // Assume the current index has the minimum element
            int minIndex = i;

            // Find the minimum element in the remaining unsorted array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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
