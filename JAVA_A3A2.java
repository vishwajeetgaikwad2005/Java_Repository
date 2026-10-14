import java.io.*;
import java.util.Scanner;

public class JAVA_A3A2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String filename = sc.nextLine();

        BufferedReader br = new BufferedReader(new FileReader(filename));

        int characters = 0, lines = 0, words = 0;
        String line;

        while ((line = br.readLine()) != null) {
            lines++;
            characters += line.length();

            String[] w = line.trim().split("\\s+");

            if (!line.trim().isEmpty()) {
                words += w.length;
            }
        }

        br.close();

        System.out.println("Number of characters: " + characters);
        System.out.println("Number of lines: " + lines);
        System.out.println("Number of words: " + words);

        sc.close();
    }
}
