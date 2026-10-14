import java.util.TreeSet;
import java.util.Scanner;

public class JAVA_A4B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet<Integer> numbers = new TreeSet<>();

        System.out.print("Enter number of integers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer: ");
            int num = sc.nextInt();
            numbers.add(num);
        }

        System.out.println("Integers in sorted order:");
        System.out.println(numbers);

        sc.close();
    }
}