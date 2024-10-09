import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input strings one by one
        while (scanner.hasNext()) {
            String input = scanner.next();  // Read the next input string
            System.out.println(isBalanced(input));  // Check if the input is balanced
        }
        scanner.close();
    }
    
    // Method to check if the input string has balanced brackets
    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();  // Create a stack to store opening brackets
        
        // Traverse through the input string
        for (char ch : input.toCharArray()) {
            // Push opening brackets to the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // Check closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If stack is empty or top of the stack doesn't match with the closing bracket
                if (stack.isEmpty() || !matches(stack.pop(), ch)) {
                    return false;  // Not balanced
                }
            }
        }
        
        // Return true if the stack is empty (all brackets matched), false otherwise
        return stack.isEmpty();
    }
    
    // Helper method to check if the opening and closing brackets match
    public static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
