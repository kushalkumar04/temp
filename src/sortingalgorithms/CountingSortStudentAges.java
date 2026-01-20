package sortingalgorithms;

/*
 * This program demonstrates Counting Sort to sort
 * student ages in ascending order.
 * Since the age range is limited (10 to 18), Counting Sort
 * is very efficient for this scenario.
 */
public class CountingSortStudentAges {

    public static void main(String[] args) {

        // Array to store student ages
        int[] ages = {12, 15, 10, 18, 14, 13, 15, 11, 10, 16};

        // Display ages before sorting
        System.out.println("Student ages before sorting:");
        printArray(ages);

        // Apply Counting Sort
        countingSort(ages);

        // Display ages after sorting
        System.out.println("\nStudent ages after sorting in ascending order:");
        printArray(ages);
    }

    /*
     * This method performs Counting Sort on the array.
     * It assumes the age range is from 10 to 18.
     */
    public static void countingSort(int[] arr) {

        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;

        // Step 1: Create count array to store frequency of each age
        int[] count = new int[range];

        for (int age : arr) {
            count[age - minAge]++;
        }

        // Step 2: Modify the original array using the count array
        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                arr[index] = i + minAge;
                index++;
                count[i]--;
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

