import java.util.Scanner;

interface Shape {
    void area();
}

class Rectangle implements Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        System.out.println("Area of Rectangle: " +
                (length * breadth));
    }
}

class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }

    public void area() {
        System.out.println("Area of Square: " +
                (length * breadth));
    }
}

class Circle implements Shape {
    double radius;
    final double PI = 3.142;

    Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Area of Circle: " +
                (PI * radius * radius));
    }
}

public class JAVA_A2C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and breadth of Rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.print("Enter side of Square: ");
        double s = sc.nextDouble();

        System.out.print("Enter radius of Circle: ");
        double r = sc.nextDouble();

        Rectangle rect = new Rectangle(l, b);
        Square sq = new Square(s);
        Circle cir = new Circle(r);

        rect.area();
        sq.area();
        cir.area();

        sc.close();
    }
}