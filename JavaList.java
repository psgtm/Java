import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the initial size of the list
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        
        // Read the elements of the list
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        
        // Read the number of queries
        int q = scanner.nextInt();
        
        // Process each query
        for (int i = 0; i < q; i++) {
            String operation = scanner.next();
            
            if (operation.equals("Insert")) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                list.add(index, value);
            } else if (operation.equals("Delete")) {
                int index = scanner.nextInt();
                list.remove(index);
            }
        }
        
        // Print the final list
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}
