import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    double price;

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        bookId = sc.nextInt();

        sc.nextLine(); // Clear buffer

        System.out.print("Enter Book Name: ");
        bookName = sc.nextLine();

        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    void display() {
        System.out.println(bookId + "\t" + bookName + "\t" + price);
    }
}

public class JAVA_A1B2 {
    public static void main(String[] args) {

        Book[] books = new Book[5];

        for (int i = 0; i < 5; i++) {
            books[i] = new Book();

            System.out.println("\nEnter details of Book " + (i + 1));
            books[i].accept();
        }

        System.out.println("\nBook Details:");
        System.out.println("ID\tName\tPrice");

        for (int i = 0; i < 5; i++) {
            books[i].display();
        }
    }
}