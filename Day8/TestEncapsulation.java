class Student {

    // Private Variables
    private String name;
    private int rollNo;
    private int marks;

    // Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for Roll Number
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Setter for Marks with Validation
    public void setMarks(int marks) {

        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid Marks! Marks should be between 0 and 100.");
        }

    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Getter for Roll Number
    public int getRollNo() {
        return rollNo;
    }

    // Getter for Marks
    public int getMarks() {
        return marks;
    }

    // Display Method
    public void display() {

        System.out.println("--------------- Student Details ---------------");
        System.out.println("Name     : " + getName());
        System.out.println("Roll No  : " + getRollNo());
        System.out.println("Marks    : " + getMarks());
        System.out.println();

    }

}
public class TestEncapsulation {

    public static void main(String[] args) {

        // Student 1
        Student s1 = new Student();
        s1.setName("Ritesh");
        s1.setRollNo(101);
        s1.setMarks(85);

        // Student 2
        Student s2 = new Student();
        s2.setName("Rahul");
        s2.setRollNo(102);
        s2.setMarks(92);

        // Student 3
        Student s3 = new Student();
        s3.setName("Priya");
        s3.setRollNo(103);
        s3.setMarks(120);   // Invalid Marks

        // Display Details
        s1.display();
        s2.display();
        s3.display();

    }
}