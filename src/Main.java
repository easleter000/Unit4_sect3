import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student mark = new Student("Mark", 3.87);
        Student linda = new Student("Linda", 4.12);
        Student clarence = new Student("Clarence", 3.93);

        List<Student> students = new ArrayList<>();
        students.add(mark);
        students.add(linda);
        students.add(clarence);

        // Sort students by GPA (ascending)
        Collections.sort(students, Comparator.comparingDouble(Student::getGpa));

        System.out.println("Students sorted by GPA:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", GPA: " + student.getGpa());
        }

    }

    static class Student {
        private String name;
        private double gpa;

        public Student(String name, double gpa) {
            this.name = name;
            this.gpa = gpa;
        }

        public String getName() {
            return name;
        }

        public double getGpa() {
            return gpa;
        }
    }
}