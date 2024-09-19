import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of lines
        int n = scanner.nextInt();
        
        // Create a 2D ArrayList to store each line as an ArrayList of integers
        List<List<Integer>> arrayList = new ArrayList<>();
        
        // Read the lines
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();  // Number of integers in this line
            List<Integer> line = new ArrayList<>();
            
            // Add the integers to the line ArrayList
            for (int j = 0; j < d; j++) {
                line.add(scanner.nextInt());
            }
            
            // Add the line to the 2D ArrayList
            arrayList.add(line);
        }
        
        // Read the number of queries
        int q = scanner.nextInt();
        
        // Process each query
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();  // Line number (1-based)
            int y = scanner.nextInt();  // Position in the line (1-based)
            
            // Convert to 0-based indexing for ArrayList access
            x--;  // Convert line number to 0-based index
            y--;  // Convert position to 0-based index
            
            // Check if the line number and position are valid
            if (x < arrayList.size() && y < arrayList.get(x).size()) {
                // Valid query, print the result
                System.out.println(arrayList.get(x).get(y));
            } else {
                // Invalid query, print ERROR!
                System.out.println("ERROR!");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
