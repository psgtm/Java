import java.io.*;
import java.util.Scanner; // Import Scanner from java.util
import java.util.regex.Pattern; // Import Pattern from java.util.regex
import java.util.regex.PatternSyntaxException; // Import PatternSyntaxException

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());

        while (testCases-- > 0) {
            String pattern = scanner.nextLine();
            try {
                // Attempt to compile the regex pattern
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
        scanner.close();
    }
}
