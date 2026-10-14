
import java.util.Scanner;

class Employee {
    private int id;
    private String name, department;
    private double salary;

    Employee() {
    }

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void accept(Scanner sc) {
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Department: ");
        department = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private double bonus;

    Manager() {
        super();
    }

    Manager(int id, String name, String department,
            double salary, double bonus) {
        super(id, name, department, salary);
        this.bonus = bonus;
    }

    void accept(Scanner sc) {
        super.accept(sc);
        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();
    }

    void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " +
                (getSalary() + bonus));
    }

    double getTotalSalary() {
        return getSalary() + bonus;
    }
}

public class JAVA_A2A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of managers: ");
        int n = sc.nextInt();

        Manager[] m = new Manager[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Manager " + (i + 1));
            m[i] = new Manager();
            m[i].accept(sc);
        }

        int max = 0;

        for (int i = 1; i < n; i++) {
            if (m[i].getTotalSalary() > m[max].getTotalSalary()) {
                max = i;
            }
        }

        System.out.println("\nManager with Maximum Total Salary:");
        m[max].display();

        sc.close();
    }
}