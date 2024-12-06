import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Reading input from standard input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] numbers = new String[n];
        
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.next();
        }
        
        // Sorting based on BigDecimal values
        Arrays.sort(numbers, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                BigDecimal bigDecimalA = new BigDecimal(a);
                BigDecimal bigDecimalB = new BigDecimal(b);
                // Descending order
                return bigDecimalB.compareTo(bigDecimalA);
            }
        });
        
        // Printing the sorted array
        for (String num : numbers) {
            System.out.println(num);
        }
        
        scanner.close();
    }
}
