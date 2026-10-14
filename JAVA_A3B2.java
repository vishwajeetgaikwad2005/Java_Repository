import java.util.Scanner;

class InvalidDateException extends Exception {
    InvalidDateException(String message) {
        super(message);
    }
}

class MyDate {
    int day, month, year;

    void accept(int d, int m, int y) throws InvalidDateException {
        day = d;
        month = m;
        year = y;

        if (month < 1 || month > 12 || day < 1) {
            throw new InvalidDateException("Invalid Date");
        }

        int days;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;

            case 2:
                if ((year % 400 == 0) ||
                        (year % 4 == 0 && year % 100 != 0))
                    days = 29;
                else
                    days = 28;
                break;

            default:
                days = 31;
        }

        if (day > days) {
            throw new InvalidDateException("Invalid Date");
        }
    }

    void display() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
}

public class JAVA_A3B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyDate d = new MyDate();

        try {
            System.out.print("Enter day, month, year: ");
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();

            d.accept(day, month, year);
            d.display();

        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}