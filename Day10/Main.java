class Employee {

    String name;
    int salary;

    // Constructor
    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to be overridden
    public int calculateSalary() {
        return salary;
    }

    public void display() {
        System.out.println("Employee Name : " + name);
        System.out.println("Total Salary  : " + calculateSalary());
        System.out.println();
    }
}

// ---------------- Manager ----------------

class Manager extends Employee {

    int bonus;

    Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public int calculateSalary() {
        return salary + bonus;
    }
}

// ---------------- Developer ----------------

class Developer extends Employee {

    int overtimeHours;

    Developer(String name, int salary, int overtimeHours) {
        super(name, salary);
        this.overtimeHours = overtimeHours;
    }

    @Override
    public int calculateSalary() {
        return salary + (overtimeHours * 500);
    }
}

// ---------------- Main ----------------

public class Main {

    public static void main(String[] args) {

        Employee emp;

        emp = new Manager("Ritesh", 15000, 2000);
        emp.display();

        emp = new Developer("Rahul", 20000, 10);
        emp.display();
    }
}