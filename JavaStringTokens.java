import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        input = input.trim();
        
        if (input.length() == 0) {
            System.out.println(0);
            return;
        }
        
        String[] tokens = input.split("[^a-zA-Z]+");
        
        System.out.println(tokens.length);
        
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
