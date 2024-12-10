import java.io.*;
import java.util.*;

// Player class (predefined)
class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

// Checker class implementing Comparator
class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        // First compare scores in descending order
        if (a.score != b.score) {
            return b.score - a.score;
        }
        // If scores are the same, compare names in ascending order
        return a.name.compareTo(b.name);
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of players
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline

        // Create an array to hold Player objects
        Player[] players = new Player[n];

        // Populate the Player array
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int score = scanner.nextInt();
            players[i] = new Player(name, score);
        }

        // Sort players using Checker
        Arrays.sort(players, new Checker());

        // Print sorted players
        for (Player player : players) {
            System.out.println(player.name + " " + player.score);
        }

        scanner.close();
    }
}
