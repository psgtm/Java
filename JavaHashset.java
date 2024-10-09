import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // read the number of pairs
        sc.nextLine(); // consume the newline after the integer input

        // Create a HashSet to store unique pairs
        Set<String> uniquePairs = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            // Read both elements of the pair
            String first = sc.next();
            String second = sc.next();
            
            // Create a concatenated string to represent the pair
            String pair = first + " " + second;
            
            // Add the pair to the HashSet
            uniquePairs.add(pair);
            
            // Output the current size of the HashSet
            System.out.println(uniquePairs.size());
        }
        
        sc.close();
    }
}
