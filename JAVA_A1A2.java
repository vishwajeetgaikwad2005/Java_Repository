/*Write a Java program to reverse a number. Accept the number using command
line arguments.*/

public class JAVA_A1A2 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reverse of the number = " + reverse);
    }
}