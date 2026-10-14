/* Write a Java program to create a class MyDate with data members dd, mm, and
yy. Implement default and parameterized constructors. Display the date in dd-mm-yy
format using this keyword.*/

class MyDate {
    int dd, mm, yy;

    // Default constructor
    MyDate() {
        this.dd = 1;
        this.mm = 1;
        this.yy = 2000;
    }

    // Parameterized constructor
    MyDate(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    // Display date
    void display() {
        System.out.println(this.dd + "-" + this.mm + "-" + this.yy);
    }
}

public class JAVA_A1A4 {
    public static void main(String[] args) {

        // Default constructor
        MyDate d1 = new MyDate();

        // Parameterized constructor
        MyDate d2 = new MyDate(21, 8, 2026);

        System.out.println("Default Date:");
        d1.display();

        System.out.println("Parameterized Date:");
        d2.display();
    }
}