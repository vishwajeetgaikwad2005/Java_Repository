import java.util.HashMap;
import java.util.Scanner;

public class JAVA_A4A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Double> emp = new HashMap<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter employee name: ");
            String name = sc.nextLine();

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            emp.put(name, salary);
        }

        System.out.println("\nEmployee Details:");
        System.out.println(emp);

        System.out.print("\nEnter employee name to search: ");
        String search = sc.nextLine();

        if (emp.containsKey(search)) {
            System.out.println("Salary of " + search + ": "
                    + emp.get(search));
        } else {
            System.out.println("Employee not found.");
        }

        sc.close();
    }
}