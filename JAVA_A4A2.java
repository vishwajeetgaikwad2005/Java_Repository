import java.util.ArrayList;
import java.util.Scanner;

public class JAVA_A4A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> cities = new ArrayList<String>();

        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter city name: ");
            String city = sc.nextLine();
            cities.add(city);
        }

        System.out.println("\nList of Cities:");
        System.out.println(cities);

        cities.clear();

        System.out.println("\nArrayList after removing all elements:");
        System.out.println(cities);

        sc.close();
    }
}