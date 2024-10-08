import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read N and M
        int n = sc.nextInt();  // size of the BitSets
        int m = sc.nextInt();  // number of operations
        
        // Initialize two BitSets
        BitSet B1 = new BitSet(n);
        BitSet B2 = new BitSet(n);
        
        // Array of BitSets for easier access via index
        BitSet[] bitSets = new BitSet[3]; // We will ignore index 0 for simplicity
        bitSets[1] = B1;
        bitSets[2] = B2;
        
        // Loop through each operation
        for (int i = 0; i < m; i++) {
            String operation = sc.next();  // Read the operation name
            int x = sc.nextInt();  // Read first parameter
            int y = sc.nextInt();  // Read second parameter
            
            // Perform operations based on the input
            switch (operation) {
                case "AND":
                    bitSets[x].and(bitSets[y]);
                    break;
                case "OR":
                    bitSets[x].or(bitSets[y]);
                    break;
                case "XOR":
                    bitSets[x].xor(bitSets[y]);
                    break;
                case "FLIP":
                    bitSets[x].flip(y);
                    break;
                case "SET":
                    bitSets[x].set(y);
                    break;
            }
            
            // Print the number of 1's in B1 and B2
            System.out.println(B1.cardinality() + " " + B2.cardinality());
        }
        
        sc.close();
    }
}
