import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee{
    String name;
    int salary;
    int age;

    public Employee(String name,int salary,int age) {
        this.name=name;
        this.salary=salary;
        this.age=age;
    }

    public String toString(){
        return name+" - "+salary+ " - "+age;
    }

    
}

class comparator1 implements Comparator<Employee>{
    @Override
    public int compare(Employee e1 , Employee e2){
        return e1.salary-e2.salary;
    }
}
public class TestComparator1 {
    public static void main(String [] args){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ritesh", 5000, 45));
        employees.add(new Employee("Shivraj", 29000, 12));
        employees.add(new Employee("Sujeet", 8000, 53));
        employees.add(new Employee("Pritam", 4300, 44));
        
        employees.sort(new comparator1());
        System.out.println(employees);

    }
}

