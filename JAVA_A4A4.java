import java.util.LinkedList;
import java.util.Scanner;

public class JAVA_A4A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<String> friends = new LinkedList<>();

        System.out.print("Enter number of friends: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter friend name: ");
            String name = sc.nextLine();
            friends.add(name);
        }

        System.out.println("List of Friends:");
        System.out.println(friends);

        sc.close();
    }
}