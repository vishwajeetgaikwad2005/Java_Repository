import java.io.*;
import java.util.Scanner;

public class JAVA_A3A3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source file name: ");
        String source = sc.nextLine();

        System.out.print("Enter destination file name: ");
        String destination = sc.nextLine();

        BufferedReader br = new BufferedReader(new FileReader(source));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destination));

        String line;

        while ((line = br.readLine()) != null) {
            bw.write(line.toUpperCase());
            bw.newLine();
        }

        br.close();
        bw.close();

        System.out.println("File copied successfully in uppercase.");

        sc.close();
    }
}