import java.io.*;
import java.util.*;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class SortByCGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // Sort by CGPA (descending)
        if (s1.getCgpa() != s2.getCgpa()) {
            return Double.compare(s2.getCgpa(), s1.getCgpa());
        }
        // If CGPA is the same, sort by name (alphabetical)
        else if (!s1.getName().equals(s2.getName())) {
            return s1.getName().compareTo(s2.getName());
        }
        // If both CGPA and name are the same, sort by ID (ascending)
        else {
            return Integer.compare(s1.getId(), s2.getId());
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        List<Student> students = new ArrayList<>();
        
        // Reading input
        for (int i = 0; i < n; i++) {
            int id = scanner.nextInt();
            String name = scanner.next();
            double cgpa = scanner.nextDouble();
            students.add(new Student(id, name, cgpa));
        }
        
        // Sort students using custom comparator
        Collections.sort(students, new SortByCGPA());
        
        // Print the names of the sorted students
        for (Student student : students) {
            System.out.println(student.getName());
        }
        
        scanner.close();
    }
}
