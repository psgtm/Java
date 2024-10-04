import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create a HashMap to store the phone book entries
        Map<String, Integer> phoneBook = new HashMap<>();
        
        // Read the number of entries
        int n = sc.nextInt();
        sc.nextLine();  // Move to the next line after reading the integer
        
        // Read the name and phone number pairs
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int phone = sc.nextInt();
            sc.nextLine();  // Move to the next line after reading the integer
            
            // Store the entry in the phone book
            phoneBook.put(name, phone);
        }
        
        // Query the phone book until no more input is given
        while (sc.hasNext()) {
            String query = sc.nextLine();
            
            // Check if the name exists in the phone book
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }
        
        sc.close();
    }
}
