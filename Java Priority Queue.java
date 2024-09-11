import java.io.*;
import java.util.*;

class Student {
    private int id;
    private String name;
    private double gpa;
    
    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public double getGPA() {
        return gpa;
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (Double.compare(s2.getGPA(), s1.getGPA()) != 0) {
            return Double.compare(s2.getGPA(), s1.getGPA());
        } else if (!s1.getName().equals(s2.getName())) {
            return s1.getName().compareTo(s2.getName());
        } else {
            return Integer.compare(s1.getId(), s2.getId());
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Student> pq = new PriorityQueue<>(new StudentComparator());
        
        while (n-- > 0) {
            String event = sc.next();
            
            if (event.equals("ENTER")) {
                String name = sc.next();
                double gpa = sc.nextDouble();
                int id = sc.nextInt();
                Student student = new Student(id, name, gpa);
                pq.add(student);
            } else if (event.equals("SERVED")) {
                pq.poll(); // Remove the highest priority student
            }
        }
        
        if (pq.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            while (!pq.isEmpty()) {
                System.out.println(pq.poll().getName());
            }
        }
        
        sc.close();
    }
}
