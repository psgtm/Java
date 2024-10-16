import java.util.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList<Object> mylist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // First read the number of integers and strings
        int n1 = sc.nextInt();  // Number of integers
        int n2 = sc.nextInt();  // Number of strings

        // Add the integers to the list
        for (int i = 0; i < n1; i++) {
            mylist.add(sc.nextInt());
        }

        // Add the strings to the list
        for (int i = 0; i < n2; i++) {
            mylist.add(sc.next());
        }

        // We need to skip the integers and start printing the strings
        Iterator<Object> it = mylist.iterator();

        // Skip the integers
        for (int i = 0; i < n1; i++) {
            it.next();  // Skip the first 'n1' elements which are integers
        }

        // Now print the remaining strings
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);  // Print the strings
        }

        sc.close();
    }
}
