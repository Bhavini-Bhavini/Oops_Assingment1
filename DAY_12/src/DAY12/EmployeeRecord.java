package DAY12;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    Employee() {
        id = 0;
        name = "Not Assigned";
        department = "N/A";
        salary = 0.0;
    }

    Employee(String name, double salary) {
        this.id = 0;
        this.name = name;
        this.department = "N/A";
        this.salary = salary;
    }

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void display() {
        if (id == 0 && department.equals("N/A") && salary == 0.0) {
            System.out.println("Default record created");
        } else if (id == 0 && department.equals("N/A")) {
            System.out.printf("%s, Rs. %.2f%n", name, salary);
        } else {
            System.out.printf("%d, %s, %s, Rs. %.2f%n", id, name, department, salary);
        }
    }
}

public class EmployeeRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee();

        System.out.print("Enter name for Employee 2: ");
        String name2 = sc.nextLine();
        System.out.print("Enter salary for Employee 2: ");
        double salary2 = sc.nextDouble();
        sc.nextLine();
        Employee e2 = new Employee(name2, salary2);

        System.out.print("Enter ID for Employee 3: ");
        int id3 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name for Employee 3: ");
        String name3 = sc.nextLine();
        System.out.print("Enter department for Employee 3: ");
        String dept3 = sc.nextLine();
        System.out.print("Enter salary for Employee 3: ");
        double salary3 = sc.nextDouble();
        Employee e3 = new Employee(id3, name3, dept3, salary3);

        System.out.print("Employee 1: ");
        e1.display();
        System.out.print("Employee 2: ");
        e2.display();
        System.out.print("Employee 3: ");
        e3.display();

        sc.close();
    }
}
