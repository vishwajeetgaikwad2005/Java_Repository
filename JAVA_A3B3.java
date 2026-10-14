import java.io.*;
import java.util.Scanner;

public class JAVA_A3B3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        FileOutputStream fos = new FileOutputStream("customer.dat");
        DataOutputStream dos = new DataOutputStream(fos);

        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details of customer " + i);

            System.out.print("Customer ID: ");
            int c_id = sc.nextInt();
            sc.nextLine();

            System.out.print("Customer Name: ");
            String cname = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Mobile Number: ");
            String mobile_no = sc.nextLine();

            dos.writeInt(c_id);
            dos.writeUTF(cname);
            dos.writeUTF(address);
            dos.writeUTF(mobile_no);
        }

        dos.close();
        sc.close();

        System.out.println("Customer details stored successfully.");
    }
}
