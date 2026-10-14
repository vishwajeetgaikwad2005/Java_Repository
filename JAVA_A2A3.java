import java.util.Scanner;

interface Integer {
    void check();
}

class NumberCheck implements Integer {
    int num;

    NumberCheck(int num) {
        this.num = num;
    }

    public void check() {
        if (num > 0) {
            System.out.println("Number is Positive");
        } else if (num < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is Zero");
        }
    }
}

public class JAVA_A2A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        NumberCheck obj = new NumberCheck(n);
        obj.check();

        sc.close();
    }
}