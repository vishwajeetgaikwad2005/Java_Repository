import java.util.Scanner;

class InvalidNameException extends Exception {
    InvalidNameException(String message) {
        super(message);
    }
}

public class JAVA_A3B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Doctor Name: ");
            String name = sc.nextLine();

            if (!name.matches("[a-zA-Z ]+")) {
                throw new InvalidNameException("Name is Invalid");
            }

            System.out.println("Doctor Name: " + name);

        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}