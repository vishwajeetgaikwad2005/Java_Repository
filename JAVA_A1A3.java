/*Write a Java program to find the sum of elements of an array. Also display the
array elements in ascending order.*/

import java.util.Scanner;
import java.util.Arrays;

public class JAVA_A1A3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("Sum of array elements = " + sum);

        Arrays.sort(arr);

        System.out.println("Array elements in ascending order:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}