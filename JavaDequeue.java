import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read N (number of integers) and M (size of the subarray)
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Read the array of integers
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Deque and HashMap for sliding window and frequency tracking
        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxUnique = 0;

        // Sliding window logic
        for (int i = 0; i < n; i++) {
            int current = arr[i];

            // Add current element to the window
            deque.addLast(current);
            frequencyMap.put(current, frequencyMap.getOrDefault(current, 0) + 1);

            // If window size exceeds M, remove the oldest element
            if (deque.size() > m) {
                int removed = deque.removeFirst();
                frequencyMap.put(removed, frequencyMap.get(removed) - 1);
                if (frequencyMap.get(removed) == 0) {
                    frequencyMap.remove(removed);
                }
            }

            // Update maximum unique count
            maxUnique = Math.max(maxUnique, frequencyMap.size());
        }

        // Output the result
        System.out.println(maxUnique);

        scanner.close();
    }
}
