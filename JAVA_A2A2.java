import java.util.Scanner;

interface Shape {
    void area();
}

class Circle implements Shape {
    final double PI = 3.14;
    double r;

    Circle(double r) {
        this.r = r;
    }

    public void area() {
        System.out.println("Area of Circle: " + (PI * r * r));
    }
}

class Sphere implements Shape {
    final double PI = 3.14;
    double r;

    Sphere(double r) {
        this.r = r;
    }

    public void area() {
        System.out.println("Surface Area of Sphere: " +
                (4 * PI * r * r));
    }
}

public class JAVA_A2A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        Circle c = new Circle(r);
        Sphere s = new Sphere(r);

        c.area();
        s.area();

        sc.close();
    }
}