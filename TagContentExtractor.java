import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        
        while (testCases-- > 0) {
            String line = sc.nextLine();
            
            // Regex to find valid tags and capture their contents
            Pattern pattern = Pattern.compile("<(.+?)>([^<>]+)</\\1>");
            Matcher matcher = pattern.matcher(line);
            
            boolean found = false;
            
            // Extract and print the content between valid tags
            while (matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }
            
            // If no valid content is found
            if (!found) {
                System.out.println("None");
            }
        }
        sc.close();
    }
}
