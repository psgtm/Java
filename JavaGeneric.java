import java.io.*;
import java.util.*;

public class Solution {

    // Generic method to print any type of array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Integer array
        Integer[] intArray = {1, 2, 3};
        // String array
        String[] stringArray = {"Hello", "World"};
        
        // Call generic method to print both arrays
        printArray(intArray);
        printArray(stringArray);
    }
}