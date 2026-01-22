package runtimeanalysisandbigonotation;
import java.util.*;

public class SearchComparison {
    public static void main(String[] args) {
        int N = 100000;   // change size to 1000, 100000, 1000000
        int target = N - 1;

        // 1. Array
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i;
        }

        long start = System.nanoTime();
        boolean foundArray = false;
        for (int i = 0; i < N; i++) {
            if (arr[i] == target) {
                foundArray = true;
                break;
            }
        }
        long end = System.nanoTime();
        System.out.println("Array Search Time: " + (end - start) + " ns");

        // 2. HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            hashSet.add(i);
        }

        start = System.nanoTime();
        boolean foundHashSet = hashSet.contains(target);
        end = System.nanoTime();
        System.out.println("HashSet Search Time: " + (end - start) + " ns");

        // 3. TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            treeSet.add(i);
        }

        start = System.nanoTime();
        boolean foundTreeSet = treeSet.contains(target);
        end = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (end - start) + " ns");
    }
}
