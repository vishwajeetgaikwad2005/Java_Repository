class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}

class Student {
    int rollno;
    String name;
    int age;
    String course;

    Student(int rollno, String name, int age, String course)
            throws AgeException {
        if (age < 15 || age > 21) {
            throw new AgeException("Age Not Within The Range");
        }

        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class JAVA_A3A4 {

    public static void main(String[] args) {
        try {
            Student s = new Student(101, "Akash", 20, "BCA");
            s.display();
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}