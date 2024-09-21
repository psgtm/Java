import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        while (scanner.hasNext()) {
            String input = scanner.next();
            System.out.println(isBalanced(input));
        }
        scanner.close();
    }
    
    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        
        // Traverse through the input string
        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);  // Push opening brackets onto the stack
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;  // No matching opening bracket
                }
                char top = stack.pop();
                if (!matches(top, ch)) {
                    return false;  // Bracket type mismatch
                }
            }
        }
        
        // If stack is empty, the parentheses are balanced
        return stack.isEmpty();
    }
    
    // Helper method to check if brackets match
    public static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}