
import java.util.ArrayList;
import java.util.List;

class Student implements Comparable<Student> {

    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student otherObj) {
        return this.marks - otherObj.marks;
    }

    @Override
    public String toString() {
        return "Student name: " + name + " marks: " + marks;
    }
}

public class TestComparable {

    public static void main(String[] main) {
        List<Student> myList = new ArrayList<>();
        myList.add(new Student("Ritesh", 60));
        myList.add(new Student("Shivraj", 77));
        myList.add(new Student("Sujeet", 89));
        myList.add(new Student("Prashant", 90));
        myList.add(new Student("Pritam", 64));

        myList.sort(null);     //throws exception.
        System.out.println(myList);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(2);
        numbers.add(9);
        numbers.add(11);
        numbers.sort(null);     // This works.
        System.out.println(numbers);
    }

}
