import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading inputs
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character left by nextDouble()
        String s = scanner.nextLine();
        
        // Output
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        scanner.close();
    }
}