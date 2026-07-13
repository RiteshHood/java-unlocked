
class Employee {

    String name;
    int salary;

    public Employee(String name , int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int calculateSalary() {
        return salary;
    }

    public void display() {
        System.out.println("Employee name : "+name);
        System.out.println("Total salary: "+ calculateSalary());
        System.out.println();

    }

}

class Manager extends Employee {
    int bonus;
    public Manager(String name ,int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    public int calculateSalary(){
        return salary+bonus;
    }

}

class Developer extends Employee {

    int overtimeHours;

    Developer(String name , int salary, int overtimeHours) {
        super(name, salary);    ;
        this.overtimeHours = overtimeHours;
    }
    public int calculateSalary(){
        return salary + (overtimeHours * 500);
    }

}

public class Main {

    public static void main(String[] args) {
       
       Employee emp;

       emp = new Manager("Prshant",20000,3000);
       emp.display();

       emp = new Developer("Ritesh", 17000, 6);
       emp.display();
    }
}
