import java.util.Scanner;

public class StudentSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] students = {
                "Ritesh",
                "Rahul",
                "Priya",
                "Amit",
                "Sneha"
        };

        System.out.print("Enter student name: ");
        String searchName = sc.nextLine();

        boolean found = false;

        for (String student : students) {

            if (student.equalsIgnoreCase(searchName)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Student Found!");
        } else {
            System.out.println("Student Not Found!");
        }

        sc.close();
    }
}