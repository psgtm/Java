import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = 1; // Start with line number 1
        
        while(sc.hasNext()) { // Check if there's more input
            String line = sc.nextLine(); // Read each line of input
            System.out.println(lineNumber + " " + line); // Print the line number followed by the line
            lineNumber++; // Increment line number
        }
        
        sc.close(); // Close the scanner
    }
}
