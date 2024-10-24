import java.io.*;
import java.util.*;

// Interface for Food
interface Food {
    public String getType();
}

// Class Pizza implementing Food interface
class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

// Class Cake implementing Food interface
class Cake implements Food {
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

// Factory class to generate objects of Food type
class FoodFactory {
    // Method to return an instance of food based on the order
    public Food getFood(String order) {
        if (order.equalsIgnoreCase("pizza")) {
            return new Pizza();
        } else if (order.equalsIgnoreCase("cake")) {
            return new Cake();
        }
        return null; // Return null if the input doesn't match
    }
}

public class Solution {
    public static void main(String[] args) {
        // Reading input from STDIN
        Scanner sc = new Scanner(System.in);
        String order = sc.nextLine();

        // Create a factory instance
        FoodFactory foodFactory = new FoodFactory();

        // Get the food object
        Food food = foodFactory.getFood(order);

        // Print the type of food ordered
        if (food != null) {
            // Print "class" before the class name
            System.out.println("The factory returned " + food.getClass().toString());
            System.out.println(food.getType());
        } else {
            System.out.println("Invalid order!");
        }
    }
}
