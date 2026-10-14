import java.util.Scanner;

abstract class Staff {
    String name, address;

    Staff(String name, String address) {
        this.name = name;
        this.address = address;
    }

    abstract double calculateSalary();

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

class FullTimeStaff extends Staff {
    String department;
    double salary, hra, da;

    FullTimeStaff(String name, String address,
            String department, double salary) {
        super(name, address);
        this.department = department;
        this.salary = salary;
        hra = salary * 0.08;
        da = salary * 0.05;
    }

    double calculateSalary() {
        return salary + hra + da;
    }

    void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Basic Salary: " + salary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class PartTimeStaff extends Staff {
    int hours;
    double rate;

    PartTimeStaff(String name, String address, int hours, double rate) {
        super(name, address);
        this.hours = hours;
        this.rate = rate;
    }

    double calculateSalary() {
        return hours * rate;
    }

    void display() {
        super.display();
        System.out.println("Number of Hours: " + hours);
        System.out.println("Rate per Hour: " + rate);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

public class JAVA_A2B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of staff: ");
        int n = sc.nextInt();
        sc.nextLine();

        Staff[] s = new Staff[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n1. FullTimeStaff");
            System.out.println("2. PartTimeStaff");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter address: ");
            String address = sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter department: ");
                String dept = sc.nextLine();

                System.out.print("Enter basic salary: ");
                double sal = sc.nextDouble();
                sc.nextLine();

                s[i] = new FullTimeStaff(name, address, dept, sal);
            } else if (ch == 2) {
                System.out.print("Enter number of hours: ");
                int hours = sc.nextInt();

                System.out.print("Enter rate per hour: ");
                double rate = sc.nextDouble();
                sc.nextLine();

                s[i] = new PartTimeStaff(name, address, hours, rate);
            } else {
                System.out.println("Invalid choice!");
                i--;
            }
        }

        System.out.println("\n--- Full Time Staff Details ---");
        for (int i = 0; i < n; i++) {
            if (s[i] instanceof FullTimeStaff) {
                s[i].display();
                System.out.println();
            }
        }

        System.out.println("--- Part Time Staff Details ---");
        for (int i = 0; i < n; i++) {
            if (s[i] instanceof PartTimeStaff) {
                s[i].display();
                System.out.println();
            }
        }

        sc.close();
    }
}