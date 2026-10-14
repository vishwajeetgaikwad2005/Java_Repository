import java.util.Scanner;

interface Operation {
    double PI = 3.142;

    void area();

    void volume();
}

class Circle implements Operation {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Area of Circle: " +
                (PI * radius * radius));
    }

    public void volume() {
        System.out.println("Volume is not applicable for Circle.");
    }
}

class Cylinder implements Operation {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void area() {
        System.out.println("Area of Cylinder: " +
                (2 * PI * radius * (radius + height)));
    }

    public void volume() {
        System.out.println("Volume of Cylinder: " +
                (PI * radius * radius * height));
    }
}

public class JAVA_A2B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        Circle c = new Circle(r);
        Cylinder cy = new Cylinder(r, h);

        c.area();
        c.volume();

        cy.area();
        cy.volume();

        sc.close();
    }
}