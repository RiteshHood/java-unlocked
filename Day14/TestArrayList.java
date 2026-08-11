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
            System.out.println("7: Exit");

            System.out.println("Select an option: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addStudent(sc, students);
                    break;
                case 2:
                    viewAllStudents(students);
                    break;
                case 3:
                    searchStudent(sc, students);
                    break;
                case 4:
                    updateStudent(sc, students);
                    break;
                case 5:
                    deleteStudent(sc, students);
                    break;
                case 6:
                    totalStudents(students);
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;

            }

        }

    }

    public static void addStudent(Scanner sc, ArrayList<Student> students) {

        System.out.println("Enter student id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student Name: ");
        String stdName = sc.nextLine();

        System.out.println("Enter the Student Age: ");
        int stdAge = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Student Course: ");
        String stdCourse = sc.nextLine();

        System.out.println("Enter the Student Marks: ");
        int stdMarks = sc.nextInt();

        Student student = new Student(id, stdName, stdAge, stdCourse, stdMarks);
        students.add(student);
    }

    public static void viewAllStudents(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No student found");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void searchStudent(Scanner sc, ArrayList<Student> students) {

        System.out.println("Enter the Student name: ");
        String searchName = sc.nextLine();
        if (students.isEmpty()) {
            System.out.println("No Student found");
        }
        for (Student student : students) {
            if (searchName.equals(student.name)) {

                System.out.println(student);
            }
        }

    }

    public static void updateStudent(Scanner sc, ArrayList<Student> students) {
        System.out.println("Enter the student Id to update:  ");
        int targetId = sc.nextInt();
        sc.nextLine();

        boolean idFound = false;

        for (Student student : students) {
            if (targetId == student.id) {
                idFound = true;
                System.out.println("Id found !");
                System.out.println("choose what to update: ");

                while (true) {
                    System.out.println("1: Name");
                    System.out.println("2: Age");
                    System.out.println("3: Marks");
                    System.out.println("4: Course");

                    int choice = sc.nextInt();
                    sc.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.println("Enter new name: ");
                            String newName = sc.nextLine();
                            student.name = newName;
                            System.out.println("Name updated successfully!");
                            break;
                        case 2:
                            System.out.println("Enter the new Age: ");
                            int newAge = sc.nextInt();
                            sc.nextLine();
                            student.age = newAge;
                            System.out.println("Age updated successfully!");
                            break;
                        case 3:
                            System.out.println("Enter new Marks: ");
                            int newMarks = sc.nextInt();
                            student.marks = newMarks;
                            sc.nextLine();
                            System.out.println("Marks updated successfully!");
                            break;
                        case 4:
                            System.out.println("Enter new Course: ");
                            String newCourse = sc.nextLine();
                            student.course = newCourse;
                            System.out.println("Course updated successfully!");
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                    break;
                }

            }
        }
        if (!idFound) {
            System.out.println("ID not found");
        }
    }

    public static void deleteStudent(Scanner sc, ArrayList<Student> students) {
        System.out.println("Enter student ID to delete: ");
        int delId = sc.nextInt();
        sc.nextLine();

        boolean idFound = false;

        for (int i = 0; i < students.size(); i++) {

            Student student = students.get(i);

            if (delId == student.id) {
                idFound = true;
                students.remove(i);
                break;
            }

        }
        if (idFound) {
            System.out.println("Student removed successsfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    public static void totalStudents(ArrayList<Student> students) {
        System.out.println("Total count of students: " + students.size());
    }

}
