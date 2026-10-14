class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Developer extends Employee {
    String projectname;

    Developer(String name, double salary, String projectname) {
        super(name, salary);
        this.projectname = projectname;
    }

    void display() {
        super.display();
        System.out.println("Project Name: " + projectname);
    }
}

class Programmer extends Developer {
    String proglanguage;

    Programmer(String name, double salary, String projectname,
            String proglanguage) {
        super(name, salary, projectname);
        this.proglanguage = proglanguage;
    }

    void display() {
        super.display();
        System.out.println("Programming Language: " + proglanguage);
    }
}

public class JAVA_A2B2 {
    public static void main(String[] args) {
        Developer d = new Developer("Akash", 30000, "WatchKart");
        System.out.println("Developer Details:");
        d.display();
    }
}