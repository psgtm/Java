import java.io.*;
import java.util.*;

// Abstract class Book
abstract class Book {
    String title;
    abstract void setTitle(String s);
    
    String getTitle() {
        return title;
    }
}

// Concrete class MyBook
class MyBook extends Book {
    @Override
    void setTitle(String s) {
        this.title = s;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading the title input
        String title = scanner.nextLine();
        
        // Creating an instance of MyBook
        MyBook newNovel = new MyBook();
        newNovel.setTitle(title);
        
        // Printing the title
        System.out.println("The title is: " + newNovel.getTitle());
    }
}
