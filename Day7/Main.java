class Student {

    String name;
    int rollNo;
    int marks;

    // Method to set data
    void setData(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to check pass/fail
    String isPass() {
        if (marks >= 35) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    // Method to display student details
    void display() {
        System.out.println("-----------------------------");
        System.out.println("Name   : " + name);
        System.out.println("RollNo : " + rollNo);
        System.out.println("Marks  : " + marks);
        System.out.println("Result : " + isPass());
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setData("Ritesh", 101, 82);
        s2.setData("Rahul", 102, 67);
        s3.setData("Amit", 103, 28);

        s1.display();
        s2.display();
        s3.display();
    }
}
