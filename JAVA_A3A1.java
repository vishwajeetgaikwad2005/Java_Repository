
import java.util.Scanner;

class ZeroException extends Exception {
    ZeroException(String message) {
        super(message);
    }
}

public class JAVA_A3A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num == 0) {
                throw new ZeroException("Number is 0");
            }

            boolean prime = true;

            if (num < 2) {
                prime = false;
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (prime) {
                System.out.println("Number is Prime");
            } else {
                System.out.println("Number is Not Prime");
            }

        } catch (ZeroException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
