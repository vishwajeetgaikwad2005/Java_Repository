import java.util.Scanner;

class Person {
    int pid;
    String pname;
    int age;
    String gender;

    // Default constructor
    Person() {
        this.pid = 0;
        this.pname = "Unknown";
        this.age = 0;
        this.gender = "Unknown";
    }

    // Parameterized constructor
    Person(int pid, String pname, int age, String gender) {
        this.pid = pid;
        this.pname = pname;
        this.age = age;
        this.gender = gender;
    }

    // Display method
    void display() {
        System.out.println(pid + "\t" + pname + "\t" + age + "\t" + gender);
    }
}

public class JAVA_A1C1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Person[] p = new Person[5];

        // Accept details of 5 persons
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details of Person " + (i + 1));

            System.out.print("Enter PID: ");
            int pid = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Name: ");
            String pname = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Gender: ");
            String gender = sc.nextLine();

            p[i] = new Person(pid, pname, age, gender);
        }

        // Display details
        System.out.println("\nPerson Details:");
        System.out.println("PID\tName\tAge\tGender");

        for (int i = 0; i < 5; i++) {
            p[i].display();
        }

        sc.close();
    }
}