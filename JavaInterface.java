import java.io.*;
import java.util.*;

// Define the AdvancedArithmetic interface
interface AdvancedArithmetic {
    int divisorSum(int n);
}

// Implement the interface in the MyCalculator class
class MyCalculator implements AdvancedArithmetic {
    // Method to calculate the sum of divisors
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the input number
        int n = sc.nextInt();
        
        // Create an instance of MyCalculator
        MyCalculator myCalculator = new MyCalculator();
        
        // Print the implementation notice
        System.out.println("I implemented: AdvancedArithmetic");
        
        // Calculate and print the sum of divisors
        System.out.println(myCalculator.divisorSum(n));
        
        // Close the scanner
        sc.close();
    }
}
