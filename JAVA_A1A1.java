/*Write a Java program to accept a number using the BufferedReader class and
generate the multiplication table of the given number.*/

import java.io.*;

public class JAVA_A1A1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        System.out.println("Multiplication Table of " + num + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + (num * i));
        }
    }
}