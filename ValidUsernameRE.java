import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String usernamePattern = "^[a-zA-Z]\\w{7,29}$";
        
        while (n-- > 0) {
            String username = sc.nextLine();
            if (username.matches(usernamePattern)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
        sc.close();
    }
}
