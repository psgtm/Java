import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Use BufferedReader to read input
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Parse the input integer N
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        // Apply the conditional logic to decide the output
        if (N % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else if (N > 20) {
                System.out.println("Not Weird");
            }
        }
    }
}
