import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // BufferedReader to read input
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Read the size of the array (n)
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        // Create a list to store the integers
        List<Integer> a = new ArrayList<>();

        // Read each integer on a new line
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(bufferedReader.readLine().trim()));
        }

        // Close the BufferedReader
        bufferedReader.close();

        // Print each element of the list
        for (int i = 0; i < n; i++) {
            System.out.println(a.get(i));
        }
    }
}
