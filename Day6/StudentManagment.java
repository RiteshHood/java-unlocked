
import java.util.Scanner;

class Student {

    private String name;
    private int age;
    private int marks;

    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}

public class StudentManagment {

    // static variables that belongs to the main class instead of object.
    static Student[] students = new Student[100];
    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    static void addStudent() {
        if (count>=students.length) {
            System.out.println("The database is full!");
            return;
        }
        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Student Age:");
        int ageInput = sc.nextInt();
        System.out.println("Enter Marks:");
        int marksInput = sc.nextInt();

        students[count] = new Student(name, ageInput, marksInput);
        count++;
        System.out.println("The student is added successfully.");

    }

    static void viewStudents() {
        if (count == 0) {
            System.out.println("No student found");
        }
        for (int i = 0; i <count; i++) {
            students[i].display();
        }
    }

    static void searchStudent() {
        boolean found = false;
        System.out.println("Enter name to search: ");
        String searchInput = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (students[i].getName().equalsIgnoreCase(searchInput)) {
                found = true;
                students[i].display();
            }
        }
        if (found) {
            System.out.println("Student found!");
        } else {
            System.out.println("Student not found");
        }
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("Student Record system");
            System.out.println("1.Add Student");
            System.out.println("2.View Students");
            System.out.println("3.Search student.");
            System.out.println("4.Exit");
            System.out.println("Enter the choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    System.out.println("Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

}
