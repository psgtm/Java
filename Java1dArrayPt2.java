import java.io.*;
import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        return isSolvable(leap, game, 0);
    }

    private static boolean isSolvable(int leap, int[] game, int position) {
        // Base cases
        if (position >= game.length) {
            return true; // Reached or surpassed the end
        }
        if (position < 0 || game[position] == 1) {
            return false; // Out of bounds or stuck
        }

        // Mark the current position as visited
        game[position] = 1;

        // Recursive checks
        return isSolvable(leap, game, position + leap) || // Jump forward
               isSolvable(leap, game, position + 1) ||    // Move forward
               isSolvable(leap, game, position - 1);     // Move backward
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt(); // Number of test cases

        while (q-- > 0) {
            int n = scanner.nextInt(); // Array size
            int leap = scanner.nextInt(); // Leap distance
            int[] game = new int[n];

            for (int i = 0; i < n; i++) {
                game[i] = scanner.nextInt();
            }

            System.out.println(canWin(leap, game) ? "YES" : "NO");
        }
        scanner.close();
    }
}
