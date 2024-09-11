import java.io.*;
import java.util.*;

class MyRegex {
    String pattern = "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|0?[0-9]{1,2})\\.)" +
                     "((25[0-5]|2[0-4][0-9]|1[0-9]{2}|0?[0-9]{1,2})\\.)" +
                     "((25[0-5]|2[0-4][0-9]|1[0-9]{2}|0?[0-9]{1,2})\\.)" +
                     "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|0?[0-9]{1,2})$";
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyRegex myRegex = new MyRegex();  // Create an instance of MyRegex

        // Read input from STDIN
        while (scanner.hasNext()) {
            String ip = scanner.nextLine();  // Read each line (IP address)
            
            // Check if the IP address matches the regex
            if (ip.matches(myRegex.pattern)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        scanner.close();
    }
}