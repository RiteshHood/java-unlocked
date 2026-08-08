// Mini Project: Student Management System (ArrayList Version)

import java.util.ArrayList;
import java.util.Scanner;

class Student {

    int id;
    String name;
    int age;
    String course;
    int marks;

    Student(int id, String name, int age, String course, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    public String toString() {
        return "ID: " + id
                + ", Name: " + name
                + ", Age: " + age
                + ", Course: " + course
                + ", Marks: " + marks;
    }
}

public class TestArrayList {

    public static void main(String[] args) {

        int choice;

        // scanner object for taking input.
        Scanner sc = new Scanner(System.in);

        //ArrayList to store the students.
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("1: Add Student");
            System.out.println("2: View All Student");
            System.out.println("3: Search Student");
            System.out.println("4: Update Student");
            System.out.println("5: Delete Student");
            System.out.println("6: Total Students");

            System.out.println("Select an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent(sc, students);
                    break;
                case 2:
                    ViewAllStudent(students);
                    break;
                case 3:

            }

        }

    }

    public static void addStudent(Scanner sc, ArrayList<Student> students) {

        System.out.println("Enter student id: ");
        int id = sc.nextInt();

        System.out.println("Enter Student Name: ");
        String stdName = sc.nextLine();
        sc.nextLine();

        System.out.println("Enter the Student Age: ");
        int stdAge = sc.nextInt();

        System.out.println("Enter the Student Course: ");
        String stdCourse = sc.nextLine();
        sc.nextLine();

        System.out.println("Enter the Student Marks: ");
        int stdMarks = sc.nextInt();

        Student student = new Student(101, "Ritesh", 20, "MCA", 88);
        students.add(student);
    }

    public static void ViewAllStudent(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No student found");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void SearchStudent() {

    }

    public static void updateStudent() {

    }

    private static void addStudent() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
