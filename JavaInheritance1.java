import java.io.*;
import java.util.*;

// Base class
class Animal {
    void walk() {
        System.out.println("I am walking");
    }
}

// Subclass
class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }
    
    void sing() {
        System.out.println("I am singing");
    }
}

public class Solution {

    public static void main(String[] args) {
        // Create an instance of Bird
        Bird bird = new Bird();
        
        // Call methods from Bird and its superclass Animal
        bird.walk();  // Inherited method from Animal
        bird.fly();   // Method from Bird class
        bird.sing();  // Method from Bird class
    }
}
